package lat.pam.uas_ppam;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class FoodData {
    public static ArrayList<Integer> getGambar() {
        ArrayList<Integer> drawables = new ArrayList<Integer>();
        drawables.add(R.drawable.black_salad);
        drawables.add(R.drawable.kopi_hitam);
        drawables.add(R.drawable.nasigoreng);
        drawables.add(R.drawable.batagor);
        drawables.add(R.drawable.cheesecake);
        drawables.add(R.drawable.cappuchino);
        drawables.add(R.drawable.cireng);
        drawables.add(R.drawable.sparkling_tea);
        drawables.add(R.drawable.donut);
        drawables.add(R.drawable.mie_goreng);

        return drawables;
    }

    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Cappuchino", "Cappuchino merupakan kopi yang populer dari Italia karena lebih sering dan lebih banyak dikonsumsi. Rasanya yang tidak terlalu pahit seperti espresso."
                , 25000, context.getDrawable(R.drawable.cappuchino)));
        list.add(new Food("Kopi Tubruk", " Kopi tubruk merupakan warisan budaya Nusantara yang masih bertahan hingga saat ini. Banyak penikmat kopi yang memilih menyeduh kopi cara ini karena praktis "
                , 10000, context.getDrawable(R.drawable.kopi_hitam)));
        list.add(new Food("Mie Goreng", "Mie Goreng Merupakan salah satu menu favorit dengan berbagai aneka rasa dan pilihan membuat mie goreng banyak diminati terutama oleh maahasiswa. "
                , 10000, context.getDrawable(R.drawable.mie_goreng)));
        list.add(new Food("Nasi Goreng", "Nasi Goreng Merupakan hidangan campuran nasi dengan rempah rempah membuat nasi goreng patut dicoba sebagai makanan kalian di kala perut kosong.Ada banyak varian rasa "
                , 15000, context.getDrawable(R.drawable.nasigoreng)));
        list.add(new Food("Batagor", "Batagor merupakan hidangan olahan tahu dan juga pangsit yang digoreng terdapat 2 macam pilihan kuah dan kering. "
                , 20000, context.getDrawable(R.drawable.batagor)));
        list.add(new Food("Cheesecake", "Cheesecake adalah kue yang biasanya dimakan sebagai hidangan penutup dan dibuat dengan mencampurkan keju bertekstur lembut, telur, susu, dan gula."
                , 30000, context.getDrawable(R.drawable.cheesecake)));
        return list;
    }

}
