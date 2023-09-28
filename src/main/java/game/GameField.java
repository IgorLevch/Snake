package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GameField extends JPanel implements ActionListener {

    private final int SIZE = 320;// сторона поля
    private final int DOT_SIZE = 16; // размер в пикселях того, сколько будет занимать одна ячейка змейки или яблочка
    // в пикселях
    private final int ALL_DOTS = 400; // сколько единиц игровых может поместиться на поле(20*20)
    private Image dot;
    private Image apple;
    private int appleX; // позиция яблока в Х и Y
    private int appleY;
    private int[] x = new int[ALL_DOTS]; // массивы для того, чтобы хранить все положэения змейки
    private int[] y = new int[ALL_DOTS];
    private int dots; // размер змейки
    private Timer timer; // стандартный свинговый таймер
    private boolean left;
    private boolean right = true;
    private boolean up;
    private boolean down;
    private boolean inGame = true;

    public GameField() {
        setBackground(Color.blue);
        loadImages();
        initGame();
        addKeyListener(new FieldKeyListener());
        setFocusable(true); // чтобы фокус был на игровом поле, т.е. чтобы при нажатии печатных клавиш фокус был бы
        // на игровом поле

    }

    public void initGame() { // метод иницализирует начало игры
        dots = 3; //инициализируем начальное кол-во точек
        for (int i = 0; i < dots; i++) {
            x[i] = 48 - i * DOT_SIZE; //начальная х - позиция будет на числе 48 и до нуля
            y[i] = 48;
        }
        timer = new Timer(250, this); //250 - это с какой частотой будет тикать
        //  this - означает , что это класс(GameField), будет отвечать за вызов таймера каждые 250 млсекунд.
        timer.start();
        createApple();
    }

    public void createApple() {
        appleX = new Random().nextInt(20) * DOT_SIZE;  // 20 16-пиксельных квадратиков может поиеститься
        // на игровое поле (320 на 320) и умножаем на размерность поля
        appleY = new Random().nextInt(20) * DOT_SIZE;
    }

    public void loadImages() {          // метод для загрузки картинок
        ImageIcon iia = new ImageIcon("C:\\Users\\Igor\\IdeaProjects\\Snake\\src\\apple.png");
        apple = iia.getImage();
        ImageIcon iid = new ImageIcon("C:\\Users\\Igor\\IdeaProjects\\Snake\\src\\dot.png");
        dot = iid.getImage();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  // техническая инфо остается за кулисами
        if (inGame) {
            g.drawImage(apple, appleX, appleY, this);
            for (int i = 0; i < dots; i++) {
                g.drawImage(dot, x[i], y[i], this);

            }
        } else{
            String str = "Game over";
            // Font f = new Font("Arial",14,Font.BOLD); // создаем новый шрифт
            g.setColor(Color.white); // ставим белый цвет для отрисовки
            //g.setFont(f); // zadaem nash shrift
            g.drawString(str,125,SIZE/2); // рисуем нашу строку на поле.

        }
    }


    public void move() {  // будет происходить логическая переадресовка точек(т.е. они будут сдвигаться в том массиве,
        // который мы задали для хранения ячеек )
        for (int i = dots; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];  // все точки, которые не голова, мы переместили на предыдущие позиции
        }
        if (left) {
            x[0] -= DOT_SIZE;  // это для головы туда, куда указано направление
        }
        if (right) {
            x[0] += DOT_SIZE;  // это для головы
        }
        if (up) {
            y[0] -= DOT_SIZE;  // это для головы
        }
        if (down) {
            y[0] += DOT_SIZE;  // это для головы
        }
    }


    public void checkApple() {
        if (x[0] == appleX && y[0] == appleY) {
            dots++;
            createApple();
        }
    }

    public void checkCollisions() {
        for (int i = dots; i > 0; i--) {
            if (i > 4 && x[0] == x[i] && y[0] == y[i]) {
                inGame = false;  // это все , если сталкивается змейка сама с собой (кол-во ячеек больше 4)
            }
        }
        if (x[0] > SIZE) {    // 4 диспозиции, если выходим за границы поля.
            inGame = false;
        }
        if (x[0] < 0) {
            inGame = false;
        }
        if (y[0] > SIZE) {
            inGame = false;
        }
        if (y[0] < 0) {
            inGame = false;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {  // метод будет взываться каждый раз, когда будет тикать таймер
        // 250 миллисекунд
        if (inGame) {
            checkApple(); // проверяем -- не встретили ли яблоко по пути.
            checkCollisions();         // проверяем, не произошла ли коллизия с борюдрами, т.е. с границами игрового поля.
            move();
        }
        repaint();  // чтобы перерисовывать поле.Метод, который вызывает paintComponent
        // а paintComponent - стандартный метод для отрисовки всех компонентов в свинге. Вызывается буквально либо когда
        // мы его вызываем, либо операционной системой, когда увели окно за какие-то пределы.
        // (ОС-ме нужно его перерисовать)

    }

    class FieldKeyListener extends KeyAdapter {
        // в этом классе переопределяем метод кейпрессд.


        @Override
        public void keyPressed(KeyEvent e) {  // это класс для того,  чтобы сделать обработку нажитя клавиш
            super.keyPressed(e);
            int key = e.getKeyCode(); // клавиши, которые были нажаты
            if (key == KeyEvent.VK_LEFT && !right) {              // в соответствии с тем, какая клавиша была нажата, будут происходить
                // изменения в направлении   **** здесь: если нажата клавиша влево и при этом мы
                // не двигаемся вправо.
                left = true;
                up = false;
                down = false;
            }
            if (key == KeyEvent.VK_RIGHT && !left) {              // в соответствии с тем, какая клавиша была нажата, будут происходить
                // изменения в направлении   **** здесь: если нажата клавиша влево и при этом мы
                // не двигаемся вправо.
                right = true;
                up = false;
                down = false;
            }
            if (key == KeyEvent.VK_UP && !down) {              // в соответствии с тем, какая клавиша была нажата, будут происходить
                // изменения в направлении   **** здесь: если нажата клавиша влево и при этом мы
                // не двигаемся вправо.
                left = false;
                up = true;
                right = false;
            }

            if(key==KeyEvent.VK_DOWN && !up){              // в соответствии с тем, какая клавиша была нажата, будут происходить
                // изменения в направлении   **** здесь: если нажата клавиша влево и при этом мы
                // не двигаемся вправо.
                left = false;
                right= false;
                down = true;
            }


        }


    }
}