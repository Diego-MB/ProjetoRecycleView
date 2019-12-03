package br.edu.ifsp.scl.projetorecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Hero> heroList;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        initHero();

        HeroAdapter adapter = new HeroAdapter(heroList);

        recyclerView.setAdapter(adapter);

        HeroClickItemList heroClickItemList = new HeroClickItemList();

        RecyclerItemClickListener recyclerItemClickListener = new RecyclerItemClickListener(getApplicationContext(), recyclerView, heroClickItemList);

        recyclerView.addOnItemTouchListener(recyclerItemClickListener);

    }

    private void initHero() {

        heroList = new ArrayList<>();
        heroList.add(new Hero(1,R.drawable.aquaman, "Aquaman", "O Aquaman é o rei de Atlantis, no reino do fundo do mar. Na superfície, Aquaman é chamado de Arthur Curry, mas em Atlantis é conhecido como Orin. O Aquaman controla tudo o que é feito de água e é capaz de pedir ajuda a todos os animais marítimos.", "DC Comics"));
        heroList.add(new Hero(2,R.drawable.batman, "Batman", "Batman, o Homem Morcego, é a identidade secreta do bilionário Bruce Wayne. Bruce teve seus pais assassinados quando ainda era criança, o que criou em seu coração uma necessidade de acabar com o crime e os criminosos de sua cidade, Gotham City. O morcego simboliza uma das criaturas das quais Bruce mais temia e, com sua fortuna e ajuda de seu mordomo, Alfred, Bruce passou a combater os criminosos e mentes por trás do crime em Gotham. O Batman não tem nenhum poder, utilizando somente suas técnicas de luta e aparatos que constrói em sua Batcaverna.", "DC Comics"));
        heroList.add(new Hero(3,R.drawable.capitao_america, "Capitão América", "O Capitão América, um dos mais famosos super heróis do mundo, é a identidade secreta do militar Steve Rogers. O Capitão América foi criado no contexto da Segunda Guerra Mundial para incitar o patriotismo nos cidadãos americanos. Por ser um super soldado, o Capitão América tem força, velocidade, reflexos e resistência sobre humanas, além de uma maior capacidade de aprendizado e inteligência.", "Marvel Comics"));
        heroList.add(new Hero(4,R.drawable.capitao_planeta, "Capitão Planeta", "O Capitão Planeta foi criado pelo empresário Ted Turner, como uma forma de alertar as crianças e os jovens dos problemas da Terra. O Capitão Planeta é formado pela junção de 5 elementos: água, terra, fogo, vento e coração. O Capitão Planeta tem o poder de controlar todos os elementos naturais da Terra e o objetivo de manter a harmonia da natureza.", "--------"));
        heroList.add(new Hero(5,R.drawable.flash, "Flash", "O Flash é um super herói já vivido por muitos homens, mas o mais famoso deles foi Berry Allen. Allen recebeu seus poderes após sofrer um acidente, sendo banhado por produtos químicos depois de seu laboratória ter sido atingido por um raio. Membro da Liga da Justiça, o Flash tem a super velocidade com o seu principal poder. Essa super velocidade o permite atingir a velocidade da luz e ultrapassar objetos sólidos.", "DC Comics"));
        heroList.add(new Hero(6,R.drawable.mulher_maravilha, "Mulher Maravilha", "A Mulher Maravilha, vivida pela princesa Diana, é uma das mais famosas heroínas das história em quadrinhos. A princesa Diana de Themyscira foi criada por sua mãe a partir do barro e recebeu vida dos cinco deuses do Olimpo. Diana foi enviada ao mundo dos homens para combater as guerras e manter a paz na Terra. Seus super poderes incluem: super força, velocidade, voo, regeneração e imortalidade por causas naturais.", "DC Comics"));
        heroList.add(new Hero(7,R.drawable.spiderman, "Spiderman", "Spider Man, ou Homem Aranha, é a identidade secreta de Peter Parker, que decidiu combater o crime depois de ter visto seu tio ser brutalmente assassinado. Peter foi picada por uma aranha que carregava moléculas radioativas e passou a ter poderes de aranha, como a habilidade de soltar teias e de grudar seu corpo em superfícies. ", "Marvel Comics"));
        heroList.add(new Hero(8,R.drawable.super_choque, "Super Choque", "Super Choque é a identidade secreta de Virgil Hawkins, um estudante afro americano que foi exposto acidentalmente a um gás radioativo e ganhou poderes eletro estáticos. Virgil passou a usar seus super poderes para combater os vilões criados a partir da exposição do mesmo gás que o afetou.", "Warner Bros."));
        heroList.add(new Hero(9,R.drawable.thor, "Thor", "Thor, o deus do trovão da mitologia nórdica, é príncipe do mundo de Asgard, filho do deus supremo Odin e irmão do traiçoeiro Loki. Thor é considerado por muitos como o mais poderoso super-heróis do mundo Marvel por ser um deus e não um humano. Os poderes de Thor incluem força, velocidade e resistência sobre-humana, longevidade, capacidade de controlar os elementos da tempestade e o martelo Mjolnir, capaz de destruir qualquer coisa.", "Marvel Comics"));
        heroList.add(new Hero(10,R.drawable.wolverine, "Wolverine", "Wolverine, alter ego de James Logan, foi uma experiência científica bem sucedida, que o permitiu ter super força e velocidade, além de garras de adamantium nas mãos e poder de regeneração. É um dos mais conhecidos super heróis membros dos X-Men.", "Marvel Comics"));

    }

    private class HeroClickItemList implements RecyclerItemClickListener.OnItemClickListener {

        @Override
        public void onItemClick(View view, int position) {

            String title = heroList.get(position).getTitle();
            Toast.makeText(MainActivity.this, title, Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onLongItemClick(View view, int position) {

            String company = heroList.get(position).getCompany();
            Toast.makeText(MainActivity.this, company, Toast.LENGTH_SHORT).show();


        }
    }
}
