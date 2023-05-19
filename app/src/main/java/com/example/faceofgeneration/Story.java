package com.example.faceofgeneration;

import android.view.View;
import android.widget.ImageView;
import android.media.MediaPlayer;

import com.bumptech.glide.Glide;

public class Story {
    public DatabaseHelper databaseHelper;
    MediaPlayer mediaPlayer;
    double beatmaker = 0;
    double rapper = 0;
    double musician = 0;
    double nikto = 0;
    GameScreen gs;
    String nextPosition1, nextPosition2, nextPosition3, nextPosition4;


    public Story(GameScreen gs) {
        this.gs = gs;
    }

    public void selectPosition(String position) {
        switch (position) {
            case "startingPoint":
                startingPoint();
                break;
            case "start1":
                start1();
                break;
            case "beatmaker1":
                beatmaker1();
                break;
            case "rapper1":
                rapper1();
                break;
            case "musician1":
                musician1();
                break;
            case "beatmakerstart":
                beatmakerstart();
                break;
            case "rapperstart":
                rapperstart();
                break;
            case "musicianstart":
                musicianstart();
                break;
            case "niktostart":
                niktostart();
                break;
            case "beatmaker2":
                beatmaker2();
                break;
            case "rapper2":
                rapper2();
                break;
            case "musician2":
                musician2();
                break;
            case "nikto2":
                nikto2();
                break;
            case "start2":
                start2();
                break;
            case "rapper3":
                rapper3();
                break;
            case "beatmaker3":
                beatmaker3();
                break;
            case "musician3":
                musician3();
                break;
            case "start3":
                start3();
                break;
            case "nextrapper":
                nextrapper();
                break;
            case "nextrapper1":
                nextrapper1();
                break;
            case "nextrapper1_1":
                nextrapper1_1();
                break;
            case "nextrapper1_11":
                nextrapper1_11();
                break;
            case "nextrapper1_111":
                nextrapper1_111();
                break;
            case "nextrapper2":
                nextrapper2();
                break;
            case "nextrapper3":
                nextrapper3();
                break;
            case "nextrapper4":
                nextrapper4();
                break;
            case "nextrapper5":
                nextrapper5();
                break;
            case "nextrapper6":
                nextrapper6();
                break;
            case "theend":
                theend();
                break;
            case "nextbeatmaker":
                nextbeatmaker();
                break;
            case "nextbeatmaker2":
                nextbeatmaker2();
                break;
            case "nextbeatmaker3":
                nextbeatmaker3();
                break;
            case "nextbeatmaker4":
                nextbeatmaker4();
                break;
            case "nextbeatmaker5":
                nextbeatmaker5();
                break;
            case "nextbeatmaker6":
                nextbeatmaker6();
                break;
            case "nextbeatmakersolo":
                nextbeatmakersolo();
                break;
            case "nextbeatmaker7":
                nextbeatmaker7();
                break;
            case "nextrapper1_2":
                nextrapper1_2();
                break;
            case "nextrapper1_12":
                nextrapper1_12();
                break;
            case "nextrappersolo":
                nextrappersolo();
                break;
            case "nextrappersolo1":
                nextrappersolo1();
                break;
            case "nextrappersolo2":
                nextrappersolo2();
                break;
            case "nextrappersolo3":
                nextrappersolo3();
                break;
            case "nextnikto":
                nextnikto();
                break;
            case "nextnikto2":
                nextnikto2();
                break;
            case "nextnikto3":
                nextnikto3();
                break;
            case "nikto1":
                nikto1();
                break;
            case "nextperednikto":
                nextperednikto();
                break;
            case "nextmusician":
                nextmusician();
                break;
            case "nextmusician2":
                nextmusician2();
                break;
            case "nextmusician3":
                nextmusician3();
                break;
            case "nextmusician4":
                nextmusician4();
                break;
            case "goTitleScreen":
                gs.goTitleScreen();
                break;
            case "nextbeatmaker3_1":
                nextbeatmaker3_1();
                break;
            case "nextrapperyeat":
                nextrapperyeat();
                break;
            case "nextrapperyeat2":
                nextrapperyeat2();
                break;
            case "nextrapperyeat3":
                nextrapperyeat3();
                break;
            case "nextrapper3_2":
                nextrapper3_2();
                break;
        }
    }

    public void showAllButtons() {
        gs.button1.setVisibility(View.VISIBLE);
        gs.button2.setVisibility(View.VISIBLE);
        gs.button3.setVisibility(View.VISIBLE);
        gs.button4.setVisibility(View.VISIBLE);
    }

    public void beatmakerUnCount() {
        beatmaker -= 0.5;
    }

    public void rapperUnCount() {
        rapper -= 0.5;
    }

    public void musicianUnCount() {
        musician -= 0.5;
    }

    public void niktoUnCount() {
        nikto -= 0.5;
    }

    public void beatmakerCount() {
        beatmaker += 1;
    }

    public void rapperCount() {
        rapper += 1;
    }

    public void musicianCount() {
        musician += 1;
    }

    public void niktoCount() {
        nikto += 1;
    }

    public void startingPoint() {
        rapper = 0;
        nikto = 0;
        beatmaker = 0;
        musician = 0;

        mediaPlayer = MediaPlayer.create(gs, R.raw.ilck);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);

        gs.image.setImageResource(R.drawable.internat);

        gs.text.setText("Когда я родился, мои родители будучи музыкантами" +
                " не хотели обо мне заботится и решили отдать меня в интернат.");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "start1";
        nextPosition2 = "not bad";
        nextPosition3 = "bad";
        nextPosition4 = "suspicious";
    }


    public void start1() {

        showAllButtons();

        gs.image.setImageResource(R.drawable.rebenokjpg);

        gs.text.setText("В 3 года меня уже тянуло к музыке." +
                " На каком инструменте мне стоит начать играть?");

        gs.button1.setText("Пианино");
        gs.button2.setText("Синтезатор");
        gs.button3.setText("Гитара");
        gs.button4.setText("Лучше поиграю в игрушки");
        gs.button2.setVisibility(View.VISIBLE);
        gs.button3.setVisibility(View.VISIBLE);
        gs.button4.setVisibility(View.VISIBLE);

        nextPosition1 = "beatmaker1";
        nextPosition2 = "rapper1";
        nextPosition3 = "musician1";
        nextPosition4 = "nikto1";
    }

    public void beatmaker1() {
        gs.image.setImageResource(R.drawable.pianoboy);

        gs.text.setText("Я решил научиться играть на пианино");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "beatmakerstart";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";

        beatmakerCount();


    }

    public void rapper1() {
        Glide.with(gs)
                .asGif()
                .load(R.drawable.synthezatorboy)
                .into(gs.image);

        gs.text.setText("Я решил научиться играть на синтезаторе");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "rapperstart";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";

        rapperCount();
    }

    public void musician1() {
        Glide.with(gs)
                .asGif()
                .load(R.drawable.guitarboy)
                .into(gs.image);

        gs.text.setText("Я решил научиться играть на гитаре");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "musicianstart";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";

        musicianCount();
    }
    public void nikto1() {
        gs.image.setImageResource(R.drawable.rebenochek);

        gs.text.setText("В раннем детстве музыка меня не интересовала.");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "niktostart";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";

        niktoCount();
    }

    public void beatmakerstart() {
        showAllButtons();
        gs.image.setImageResource(R.drawable.boychoice1);

        gs.text.setText("К 9 годам я уже достаточно хорошо научился играть на пианино, " +
                "стоит ли мне попробовать другой инструмент?");

        gs.button1.setText("Хочу попробовать синтезатор");
        gs.button2.setText("Хочу научиться играть на гитаре");
        gs.button3.setText("Лучше буду дальше играть на пианино");
        gs.button4.setText("Надоело заниматься музыкой");

        nextPosition1 = "rapper2";
        nextPosition2 = "musician2";
        nextPosition3 = "beatmaker2";
        nextPosition4 = "nikto2";

    }

    public void rapperstart() {
        showAllButtons();
        gs.image.setImageResource(R.drawable.boychoice1);

        gs.text.setText("К 9 годам я уже достаточно хорошо научился играть на синтезаторе, " +
                "стоит ли мне попробовать другой инструмент?");

        gs.button1.setText("Хочу попробовать пианино");
        gs.button2.setText("Хочу научиться играть на гитаре");
        gs.button3.setText("Лучше буду дальше играть на синтезаторе");
        gs.button4.setText("Надоело заниматься музыкой");

        nextPosition1 = "beatmaker2";
        nextPosition2 = "musician2";
        nextPosition3 = "rapper2";
        nextPosition4 = "nikto2";

    }

    public void musicianstart() {
        showAllButtons();
        gs.image.setImageResource(R.drawable.boychoice1);

        gs.text.setText("К 9 годам я уже достаточно хорошо научился играть на гитаре, " +
                "стоит ли мне попробовать другой инструмент?");

        gs.button1.setText("Хочу попробовать синтезатор");
        gs.button2.setText("Хочу научиться играть на пианино");
        gs.button3.setText("Лучше буду дальше играть на гитаре");
        gs.button4.setText("Надоело заниматься музыкой");

        nextPosition1 = "rapper2";
        nextPosition2 = "beatmaker2";
        nextPosition3 = "musician2";
        nextPosition4 = "nikto2";

    }

    public void niktostart() {
        showAllButtons();
        gs.image.setImageResource(R.drawable.boychoice1);

        gs.text.setText("К 9 годам у меня не было никаких увлечений," +
                " и вдруг я подумал может быть...");

        gs.button1.setText("Хочу научиться играть на синтезаторе");
        gs.button2.setText("Хочу научиться играть на пианино");
        gs.button3.setText("Хочу научиться играть на гитаре");
        gs.button4.setText("Лучше пойду поиграю с ребятами в футбол");

        nextPosition1 = "rapper2";
        nextPosition2 = "beatmaker2";
        nextPosition3 = "musician2";
        nextPosition4 = "nikto2";

    }

    public void beatmaker2() {
        gs.image.setImageResource(R.drawable.pianoboy);

        gs.text.setText("Я продолжил заниматься на пианино");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "start2";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";

        beatmakerCount();
        if (rapper > 0) {
            rapperUnCount();
        }
        if (nikto > 0) {
            niktoUnCount();
        }
        if (musician > 0) {
            musicianUnCount();
        }
    }

    public void rapper2() {
        Glide.with(gs)
                .asGif()
                .load(R.drawable.synthezatorboy)
                .into(gs.image);

        gs.text.setText("Я продолжил заниматься на синтезаторе");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "start2";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";

        rapperCount();
        if (beatmaker > 0) {
            beatmakerUnCount();
        }
        if (nikto > 0) {
            niktoUnCount();
        }
        if (musician > 0) {
            musicianUnCount();
        }
    }

    public void musician2() {
        Glide.with(gs)
                .asGif()
                .load(R.drawable.guitarboy)
                .into(gs.image);

        gs.text.setText("Я продолжил заниматься на гитаре");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "start2";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";

        musicianCount();
        if (beatmaker > 0) {
            beatmakerUnCount();
        }
        if (nikto > 0) {
            niktoUnCount();
        }
        if (rapper > 0) {
            rapperUnCount();
        }
    }

    public void nikto2() {
        gs.image.setImageResource(R.drawable.footboy);

        gs.text.setText("Футбол с друзьями был намного интереснее!");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "start2";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";

        niktoCount();
        if (beatmaker > 0) {
            beatmakerUnCount();
        }
        if (musician > 0) {
            musicianUnCount();
        }
        if (rapper > 0) {
            rapperUnCount();
        }
    }

    public void start2() {
        mediaPlayer.stop();
        mediaPlayer.release();
        mediaPlayer = MediaPlayer.create(gs, R.raw.yeatmeenfeen);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);



        showAllButtons();

        gs.image.setImageResource(R.drawable.teatr);

        gs.text.setText("Первый концерт нашего интерната в городском театре." +
                " Мне предложили выступить солистом, стоит ли мне согласиться?");

        gs.button1.setText("Да я об этом мечтал!");
        gs.button2.setText("Лучше сыграю на каком нибудь инструменте");
        gs.button3.setText("Я не хочу принимать в этом участие!");
        gs.button4.setText("");
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "rapper3";
        if (musician > beatmaker) {
            nextPosition2 = "musician3";
        } else {
            nextPosition2 = "beatmaker3";
        }
        nextPosition3 = "start3";
        nextPosition4 = "";
    }

    public void rapper3() {
        gs.image.setImageResource(R.drawable.rapperteatr);

        gs.text.setText("Перед тем как выйти на сцену меня терзали сомнения," +
                " но оказавшись перед собравшимся залом," +
                " я ощутил себя свободным... и просто начал петь.");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "start3";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";

        rapperCount();
        if (beatmaker > 0) {
            beatmakerUnCount();
        }
        if (nikto > 0) {
            niktoUnCount();
        }
        if (musician > 0) {
            musicianUnCount();
        }
    }

    public void beatmaker3() {
        gs.image.setImageResource(R.drawable.beatmakerteatr);

        gs.text.setText("Я согласился выступить, но не солистом, а пианистом." +
                " Перед выступлением я волновался, но на сцене будто все позабыл и начал играть.");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "start3";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";

        beatmakerCount();
        if (rapper > 0) {
            rapperUnCount();
        }
        if (nikto > 0) {
            niktoUnCount();
        }
        if (musician > 0) {
            musicianUnCount();
        }
    }

    public void musician3() {
        gs.image.setImageResource(R.drawable.musicianteatr);

        gs.text.setText("Я согласился выступить, но не солистом, а гитаристом." +
                " Перед выступлением я волновался, но на сцене будто все позабыл и начал играть.");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "start3";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";

        musicianCount();
        if (rapper > 0) {
            rapperUnCount();
        }
        if (nikto > 0) {
            niktoUnCount();
        }
        if (beatmaker > 0) {
            beatmakerUnCount();
        }
    }

    public void start3() {
        mediaPlayer.stop();
        mediaPlayer.release();
        mediaPlayer = MediaPlayer.create(gs, R.raw.cheers);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);

        showAllButtons();

        gs.image.setImageResource(R.drawable.teatr);

        gs.text.setText("Концерт прошел успешно, зрители" +
                " и наши воспитатели были в высочайшем восторге.");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        if (rapper > beatmaker && rapper > musician) {
            nextPosition1 = "nextrapper";
        } else if (beatmaker > rapper && beatmaker > musician) {
            nextPosition1 = "nextbeatmaker";
        } else if (musician > rapper && musician > beatmaker) {
            nextPosition1 = "nextmusician";
        } else {
            nextPosition1 = "nextperednikto";
        }
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextmusician() {
        mediaPlayer.stop();
        mediaPlayer.release();
        mediaPlayer = MediaPlayer.create(gs, R.raw.katharsis);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);

        showAllButtons();

        Glide.with(gs)
                .asGif()
                .load(R.drawable.basist)
                .into(gs.image);

        gs.text.setText("После своего 18 летия я ушел из интерната и решил стать басистом в музыкальной группе");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextmusician2";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextmusician2() {

        showAllButtons();

        Glide.with(gs)
                .asGif()
                .load(R.drawable.basistik)
                .into(gs.image);

        gs.text.setText("Спустя год мы с группой начали гастролировать" +
                " и стали одной большой семьей, но в один момент" +
                " продюсер группы решил сменить меня на другого басиста.");

        gs.button1.setText("Я не потерплю такого к себе отношения!");
        gs.button2.setText("Я готов победить в этой конкуренции.");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextrappersolo";
        nextPosition2 = "nextmusician3";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextmusician3() {

        showAllButtons();

        Glide.with(gs)
                .asGif()
                .load(R.drawable.sensei)
                .into(gs.image);

        gs.text.setText("В итоге на гастролях тот басист допустил множество" +
                " ошибок и команда решила оставить меня. Фанаты были очень рады." +
                " Я пообещал им, что мы всегда будем вместе.");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextmusician4";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextmusician4() {
        String rapperString = String.valueOf(rapper);
        String beatmakerString = String.valueOf(beatmaker);
        String musicianString = String.valueOf(musician);
        String niktoString = String.valueOf(nikto);
        gs.saveData("Басист группы поколения", rapperString, beatmakerString, musicianString, niktoString);

        showAllButtons();

        Glide.with(gs)
                .asGif()
                .load(R.drawable.grammy)
                .into(gs.image);

        gs.text.setText("Спустя 5 лет мы выпустили свой самый популярный альбом," +
                " каждый из нас выложился на полную." +
                "За этот альбом нас наградили Грэмми и прозвали <<Группой поколения>>");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "theend";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";
    }


    public void nextperednikto() {
        mediaPlayer.stop();
        mediaPlayer.release();
        mediaPlayer = MediaPlayer.create(gs, R.raw.ineedu);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);

        showAllButtons();

        Glide.with(gs)
                .asGif()
                .load(R.drawable.birthday)
                .into(gs.image);

        gs.text.setText("Наконец-то мне исполнилось 18 лет, и как настоящий мужик я решил пойти в клуб");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextnikto";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextbeatmaker() {
        mediaPlayer.stop();
        mediaPlayer.release();
        mediaPlayer = MediaPlayer.create(gs, R.raw.nostylisy);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
        showAllButtons();
        beatmakerCount();
        Glide.with(gs)
                .asGif()
                .load(R.drawable.birthday)
                .into(gs.image);

        gs.text.setText("Наконец-то мне исполнилось 18 лет, я ушел из интерната" +
                " и готов начать свой музыкальный путь битмейкера!");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextbeatmaker2";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextbeatmaker2() {
        showAllButtons();

        Glide.with(gs)
                .asGif()
                .load(R.drawable.typebeat)
                .into(gs.image);

        gs.text.setText("Стоит ли мне пойти работать на студию или выкладывать биты на ютуб?");

        gs.button1.setText("Лучше на студии в живую");
        gs.button2.setText("Лучше выкладывать биты на ютуб");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextbeatmaker3";
        nextPosition2 = "nextbeatmaker3_1";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextbeatmaker3_1() {
        showAllButtons();

        Glide.with(gs)
                .asGif()
                .load(R.drawable.kaicenat)
                .into(gs.image);

        gs.text.setText("Спустя год выкладывания битов на ютуб," +
                " я набрал больше 10 тысяч подписчиков." +
                " На один из битов залетел kai cenat и пригласил меня на студию");

        gs.button1.setText("Приехать на студию.");
        gs.button2.setText("Не ехать");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextbeatmaker4";
        nextPosition2 = "nextrappersolo";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextbeatmaker3() {
        showAllButtons();

        Glide.with(gs)
                .asGif()
                .load(R.drawable.destroybeat)
                .into(gs.image);

        gs.text.setText("Я основал свою студию. За год я познакомился" +
                " с большим количеством реперов один из которых - Destroy Lonely");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextbeatmaker4";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";
    }

    public void nextbeatmaker4() {
        showAllButtons();
        gs.image.setImageResource(R.drawable.cxdy);

        gs.text.setText("Я ему спродюсировал несколько треков на альбоме." +
                " Он познакомил меня с Cxdy из Internet Money.");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextbeatmaker5";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextbeatmaker5() {
        showAllButtons();

        gs.image.setImageResource(R.drawable.shmoney);
        gs.text.setText("Мы начали много общаться и заниматься музыкой." +
                " Спустя некоторое мнение он меня позвал" +
                " в Internet Money, стоит ли мне согласиться?");

        gs.button1.setText("Да, я вступлю, будет круто!");
        gs.button2.setText("Нет, я сам буду по себе.");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextbeatmaker6";
        if (beatmaker > nikto){
            nextPosition2 = "nextbeatmakersolo";
        }
        else if (beatmaker < nikto){
            nextPosition2 = "nextnikto2";
        }
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextbeatmakersolo() {
        String rapperString = String.valueOf(rapper);
        String beatmakerString = String.valueOf(beatmaker);
        String musicianString = String.valueOf(musician);
        String niktoString = String.valueOf(nikto);
        gs.saveData("Битмейкер на заказ", rapperString, beatmakerString, musicianString, niktoString);
        mediaPlayer.stop();
        mediaPlayer.release();
        mediaPlayer = MediaPlayer.create(gs, R.raw.slayer);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
        showAllButtons();
        niktoCount();

        Glide.with(gs)
                .asGif()
                .load(R.drawable.y2k)
                .into(gs.image);

        gs.text.setText("После этого прошло несколько лет" +
                " Я продолжал выпускать музыку, но она не стреляла," +
                " может просто буду делать биты на заказ?");

        gs.button1.setText("Придется, ведь с творчеством не вышло...");
        gs.button2.setText("Никогда нельзя сдаваться!");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "theend";
        nextPosition2 = "nextrappersolo";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextbeatmaker6() {
        showAllButtons();

        Glide.with(gs)
                .asGif()
                .load(R.drawable.rio)
                .into(gs.image);

        gs.text.setText("Прошло 5 лет и я стал одним из самых востребованных битмейкеров поколения");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextbeatmaker7";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextbeatmaker7() {
        String rapperString = String.valueOf(rapper);
        String beatmakerString = String.valueOf(beatmaker);
        String musicianString = String.valueOf(musician);
        String niktoString = String.valueOf(nikto);
        gs.saveData("Битмейкер поколения", rapperString, beatmakerString, musicianString, niktoString);
        showAllButtons();

        gs.image.setImageResource(R.drawable.metro);

        gs.text.setText("Я спродюсировал множество треков и альбомов," +
                " за которые артисты получали грэмми. Фанаты прозвали меня <<Битмейкером поколения>>");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "theend";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextrapper() {
        mediaPlayer.stop();
        mediaPlayer.release();
        mediaPlayer = MediaPlayer.create(gs, R.raw.lipstick);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);

        showAllButtons();

        Glide.with(gs)
                .asGif()
                .load(R.drawable.birthday)
                .into(gs.image);

        gs.text.setText("Наконец-то мне исполнилось 18 лет, я ушел из интерната" +
                " и готов начать свой музыкальный путь реп исполнителя!");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextrapper1";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";


    }
    public void nextrapper1() {
        showAllButtons();
        gs.image.setImageResource(R.drawable.wtf);
        gs.text.setText("Мне нужно, чтобы на меня обратили внимание, как мне поступить?");

        gs.button1.setText("Выкладывать треки на soundcloud!");
        gs.button2.setText("Стоит пойти на лейбл.");
        gs.button3.setText("Лучше пойду на какую-то там party.");
        gs.button4.setText("");
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextrapper1_1";
        nextPosition2 = "nextrapper1_2";
        nextPosition3 = "nextperednikto";
        nextPosition4 = "";
    }
    public void nextrapper1_1() {
        showAllButtons();
        rapperCount();
        gs.image.setImageResource(R.drawable.lonely);
        gs.text.setText("Спустя почти пол года выкладывание своих треков," +
                " Я набрал около 30 тысяч подписчиков и познакомился с Лоуном(Destroy Lonely)");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextrapper1_11";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";
    }

    public void nextrapper1_2() {
        showAllButtons();
        rapperCount();
        niktoCount();
        gs.image.setImageResource(R.drawable.lonely);
        gs.text.setText("На прослушивании я исполнил свой трек, но меня не взяли." +
                "Стоит ли мне выложить этот трек самому?");

        gs.button1.setText("Да");
        gs.button2.setText("Не стоит");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextrapper1_111";
        nextPosition2 = "nextperednikto";
        nextPosition3 = "";
        nextPosition4 = "";
    }

    public void nextnikto() {

        showAllButtons();
        niktoCount();
        Glide.with(gs)
                .asGif()
                .load(R.drawable.kencarsonopium)
                .into(gs.image);

        gs.text.setText("На этой тусовке я познакомился с Кеном(Ken Carson) и подумал," +
                " что возможно он захочет записать со мной пару демочек.");

        gs.button1.setText("Сказать ему о своих намерениях");
        gs.button2.setText("Забыть об этом");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextrapper1_12";
        if (rapper >= nikto || beatmaker >= nikto || musician >= nikto) {
            nextPosition2 = "nextrappersolo";
        }
        else {
            nextPosition2 = "nextnikto2";
        }
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextnikto2() {
        mediaPlayer.stop();
        mediaPlayer.release();
        mediaPlayer = MediaPlayer.create(gs, R.raw.slayer);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
        showAllButtons();
        Glide.with(gs)
                .asGif()
                .load(R.drawable.y2k)
                .into(gs.image);

        gs.text.setText("Спустя некоторое время, я перестал делать музыку," +
                " так как не мог прославиться, да и удовольствие мне это уже не приносило.");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextnikto3";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextnikto3() {
        String rapperString = String.valueOf(rapper);
        String beatmakerString = String.valueOf(beatmaker);
        String musicianString = String.valueOf(musician);
        String niktoString = String.valueOf(nikto);
        gs.saveData("Разработчик видеоигр", rapperString, beatmakerString, musicianString, niktoString);
        showAllButtons();
        gs.image.setImageResource(R.drawable.gameicon);
        gs.text.setText("Так как у меня был не малый опыт в программировании," +
                " я устроился в игровую компанию на должность геймдизайнера" +
                " и в данный момент работаю над новым проектом.");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "theend";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";
    }

    public void nextrapper1_12() {
        showAllButtons();
        rapperCount();
        Glide.with(gs)
                .asGif()
                .load(R.drawable.kencarsonopium)
                .into(gs.image);
        gs.text.setText("Он был не против. После сеанса на студийке он мне сказал: <<" +
                " Бро, не хочешь присоединиться к нашему лейблу - OPIUM>>");

        gs.button1.setText("Да бро, гоу воркать вместе.");
        gs.button2.setText("Нет чувак, я соло двигаюсь");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextrapper2";
        nextPosition2 = "nextrappersolo";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextrappersolo() {
        showAllButtons();
        niktoCount();
        gs.image.setImageResource(R.drawable.soundcloud);
        gs.text.setText("Я решил продолжать выкладывать свою музыку на soundcloud.");

        gs.button1.setText("Не сдаваться!");
        gs.button2.setText("Конкретно надоела музыка!");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        if (rapper >= nikto || beatmaker >= nikto || musician >= nikto) {
            nextPosition1 = "nextrappersolo1";
        }
        else if (rapper > beatmaker && rapper > musician && rapper < nikto) {
            nextPosition1 = "nextnikto2";
        }
        else if (beatmaker > rapper && beatmaker > musician && beatmaker < nikto){
            nextPosition1 = "nextnikto2";
        }
        else if (musician > rapper && musician > beatmaker && musician < nikto){
            nextPosition1 = "nextnikto2";
        }
        nextPosition2 = "nextnikto2";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextrappersolo1() {
        mediaPlayer.stop();
        mediaPlayer.release();
        mediaPlayer = MediaPlayer.create(gs, R.raw.yeatshhh);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
        showAllButtons();
        Glide.with(gs)
                .asGif()
                .load(R.drawable.yeat)
                .into(gs.image);
        gs.text.setText("Спустя 3 года я набрал 20 тысяч подписчиков" +
                " и записал совместный трек с Yeat.");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextrappersolo2";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextrappersolo2() {
        showAllButtons();
        Glide.with(gs)
                .asGif()
                .load(R.drawable.yeat2)
                .into(gs.image);
        gs.text.setText("Этот трек очень сильно завирусился." +
                " Я стал тик ток звездой и подумал, что может быть создать свой лейбл?");

        gs.button1.setText("Да, это неплохая идея");
        gs.button2.setText("Нет, я только получил фэйм, все должно получиться.");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextrappersolo3";
        nextPosition2 = "nextrapperyeat";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextrapperyeat(){
        showAllButtons();
        Glide.with(gs)
                .asGif()
                .load(R.drawable.twizzy)
                .into(gs.image);
        gs.text.setText("Я отказался от идеи своего лейбла" +
                " и вместо этого решил стать twizzy и работать с yeat'ом.");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextrapperyeat2";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextrapperyeat2(){
        showAllButtons();
        Glide.with(gs)
                .asGif()
                .load(R.drawable.afterlyfe)
                .into(gs.image);
        gs.text.setText("Спустя год мы выпустили совместный альбом," +
                " треки которого заняли первые строчки billboard top 200.");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextrapperyeat3";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextrapperyeat3(){
        String rapperString = String.valueOf(rapper);
        String beatmakerString = String.valueOf(beatmaker);
        String musicianString = String.valueOf(musician);
        String niktoString = String.valueOf(nikto);
        gs.saveData("Лицо поколения с Yeat", rapperString, beatmakerString, musicianString, niktoString);
        showAllButtons();
        Glide.with(gs)
                .asGif()
                .load(R.drawable.grammy)
                .into(gs.image);
        gs.text.setText("Также за этот релиз нас наградили grammy за лучший альбом" +
                ". Не могу поверить что со мной это произошло, я стал <<лицом поколения>>.");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "theend";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextrappersolo3() {
        String rapperString = String.valueOf(rapper);
        String beatmakerString = String.valueOf(beatmaker);
        String musicianString = String.valueOf(musician);
        String niktoString = String.valueOf(nikto);
        gs.saveData("Создатель лейбла", rapperString, beatmakerString, musicianString, niktoString);
        showAllButtons();
        Glide.with(gs)
                .asGif()
                .load(R.drawable.yeat3)
                .into(gs.image);
        gs.text.setText("Я создам лейбл из самых прогрессивных" +
                " ребят и сделаю одного из них <<лицом поколения>>");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "theend";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";
    }

    public void nextrapper1_11() {
        mediaPlayer.stop();
        mediaPlayer.release();
        mediaPlayer = MediaPlayer.create(gs, R.raw.newneon);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
        showAllButtons();
        Glide.with(gs)
                .asGif()
                .load(R.drawable.playboycarti)
                .into(gs.image);

        gs.text.setText("Мы написали с ним совместный трек на его студийный альбом, " +
                "Во время записи на студии я познакомился с Playboi carti!");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextrapper1_111";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextrapper1_111() {
        showAllButtons();
        Glide.with(gs)
                .asGif()
                .load(R.drawable.opiumrequest)
                .into(gs.image);
        gs.text.setText("После выхода трека carti позвал меня на студию, я приехал," +
                " и тут он говорит: <<Бро, я в шоке от твоего парта," +
                        " хочу тебя видеть на своем лейбле!>>");

        gs.button1.setText("Да бро, я согласен вступить.");
        gs.button2.setText("Извини чувак, но я соло двигаюсь.");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);
        nextPosition1 = "nextrapper2";
        nextPosition2 = "nextrappersolo";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextrapper2() {
        showAllButtons();
        rapperCount();
        gs.image.setImageResource(R.drawable.opiummember);
        gs.text.setText("Вот так я оказался в самом прогрессивном лейбле поколения: OPIUM");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextrapper3";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextrapper3() {
        showAllButtons();
        rapperCount();
        Glide.with(gs)
                .asGif()
                .load(R.drawable.loneansw)
                .into(gs.image);;
        gs.text.setText("'Cпустя пару месяцев'" +
                " Лоун: <<Бро, давай запишем совместный альбом, ты, я и кен, как тебе идея?>>");

        gs.button1.setText("Да, давай бро взорвём индустрию!");
        gs.button2.setText("Нет бро, хочу выпустить сольник.");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextrapper4";
        nextPosition2 = "nextrapper3_2";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextrapper3_2() {
        niktoCount();
        showAllButtons();
        Glide.with(gs)
                .asGif()
                .load(R.drawable.destroylonely)
                .into(gs.image);;
        gs.text.setText("Мой альбом-сольник провалился, так как обо мне мало кто знал." +
                " В итоге люди, которых я считал своими братками выпихнули меня с лейбла.");

        gs.button1.setText("Выпускать треки самому");
        gs.button2.setText("Сдаться");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextrappersolo";
        nextPosition2 = "nextnikto2";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextrapper4() {
        showAllButtons();
        rapperCount();
        gs.image.setImageResource(R.drawable.firstalbum);
        gs.text.setText("Альбом стал бестселлером и занял первые места billboard top 200," +
                " но я чувствую, что нахожусь в тени карти, стоит ли мне уйти из лейбла?");

        gs.button1.setText("Нет, братков не брошу!");
        gs.button2.setText("Все таки стоит попробовать самому!");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextrapper5";
        nextPosition2 = "nextrappersolo";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextrapper5() {
        mediaPlayer.stop();
        mediaPlayer.release();
        mediaPlayer = MediaPlayer.create(gs, R.raw.faceofgeneratio);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
        gs.image.setImageResource(R.drawable.starwalker);
        gs.text.setText("Спустя пару лет, при поддержке лейбла я выпускаю свой 2 альбом.");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "nextrapper6";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void nextrapper6() {
        String rapperString = String.valueOf(rapper);
        String beatmakerString = String.valueOf(beatmaker);
        String musicianString = String.valueOf(musician);
        String niktoString = String.valueOf(nikto);
        gs.saveData("Лицо поколения", rapperString, beatmakerString, musicianString, niktoString);
        Glide.with(gs)
                .asGif()
                .load(R.drawable.concert)
                .into(gs.image);;
        gs.text.setText("Этот альбом стал самым продаваемым в короткие сроки," +
                " при этом я удостоился награды грэмми и музыкальная общественность" +
                " прозвала меня <<Лицом Поколения>>");

        gs.button1.setText("Дальше");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "theend";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";
    }
    public void theend() {
        Glide.with(gs)
                .asGif()
                .load(R.drawable.wlr)
                .into(gs.image);;
        gs.text.setText("Даже не могу представить что случилось бы, если бы выбрал другой путь?!");

        gs.button1.setText("Узнать об этом!");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);
        nextPosition1 = "goTitleScreen";


    }

}

