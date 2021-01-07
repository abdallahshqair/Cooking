package com.example.abdallah;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class pastry extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_pastry );
        final Toolbar toolbarpastry=findViewById (R.id.toolbarpastry );
        setActionBar ( toolbarpastry );

        final ImageView button_backe_pastry=findViewById ( R.id.backepastry );

        button_backe_pastry.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                setResult(100);
                finish();
            }
        } );




        SQLiteDatabase create_sqLiteDatabase_pastry = MainActivity.helper.getWritableDatabase ();
        create_sqLiteDatabase_pastry.execSQL("insert into pastry_dp(name_pastry ,photo_pastry,dataintent_pastry)values('بيتزا','betza','مقادير عمل البيتزا \n" +
                "\n" +
                "1- كوب دقيق ½\n" +
                "2- كوب ماء دافئ\n" +
                "3- كوب فستق حلبي مفروم \n" +
                "4- ملعقة كبيرة حليب بودر\n" +
                "5- ملعقة كبيرة سكر ناعم\n" +
                "6- ملعقة صغيرة خميرة فورية \n" +
                "7- ملعقة صغيرة فانيليا سائلة \n" +
                " \n" +


                "\n  _______________________________  " +
                "\n" +
                "طريقة تحضيرالبيتزا\n" +
                "\n" +
                "\n" +
                "1- على نار متوسطة ضعي السكر والماء وحركيه بهدوء،حتى يغلي ويذوب السكر تمامًا.\n" +
                "2- اتركيه يغلي لمدة 5 دقائق، ثم أضيفي عصير الليمون وقلبي لمدة دقيقتين ثم ارفعيه من على النار.، \n" +
                "\n" +
                " العوامة: \n" +
                "\n" +
                "1- ضعي في وعاء صغير السكر والفانيليا والخميرة ونصف كوب من الماء الدافئ وقلبيهم جيدًا، ثم ضعيه في مكان دافئ ومظلم لمدة 15 دقيقة. \n" +
                "2- في وعاء آخر، ضعي الدقيق والحليب البودر وخليط السكر والخميرة وباقي الماء الدافئ، وقلبي حتى يذوب الدقيق تمامًا.\n" +
                " 3- غطّيه بورق النايلون واتركيه في درجة حرارة الغرفة لمدة ساعة.\n" +
                "4- سخني الزيت لقلي العوامة، ثم قلبي الخليط ثم ضعي مقدار ملعقة كبيرة من العجين في الزيت، وقلبيها حتى يُصبح لونها ذهبيًا، ثم ارفعيها من الزيت وصفيها على ورق مناديل.\n" +
                " كرري هذه العملية حتى تنتهي من العجين.\n" +
                "5- اتركيها تبرد تمامًا، ثم ضعيها في القطر الدافئ واغمسيها في الفستق المفروم أو رشي بعض القرفة.\n')");

        create_sqLiteDatabase_pastry.execSQL("insert into pastry_dp(name_pastry ,photo_pastry,dataintent_pastry)values('فطيرة الجبنة','imagess1','مقادير عمل فطيرة الجبنة \n" +
                "\n" +
                "1- كوب دقيق ½\n" +
                "2- كوب ماء دافئ\n" +
                "3- كوب فستق حلبي مفروم \n" +
                "4- ملعقة كبيرة حليب بودر\n" +
                "5- ملعقة كبيرة سكر ناعم\n" +
                "6- ملعقة صغيرة خميرة فورية \n" +
                "7- ملعقة صغيرة فانيليا سائلة \n" +
                " \n" +
                " \n" +
                " 2 -1كوب سكر  \n" +
                "2- كوب ماء\n" +
                "2 -3ملعقة كبيرة عصير ليمون \n" +

                "\n  _______________________________  " +
                "\n" +
                "طريقة تحضير فطيرة الجبنة \n" +
                "\n" +
                "1- على نار متوسطة ضعي السكر والماء وحركيه بهدوء،حتى يغلي ويذوب السكر تمامًا.\n" +
                "2- اتركيه يغلي لمدة 5 دقائق، ثم أضيفي عصير الليمون وقلبي لمدة دقيقتين ثم ارفعيه من على النار.، \n" +
                "\n" +
                "1- ضعي في وعاء صغير السكر والفانيليا والخميرة ونصف كوب من الماء الدافئ وقلبيهم جيدًا، ثم ضعيه في مكان دافئ ومظلم لمدة 15 دقيقة. \n" +
                "2- في وعاء آخر، ضعي الدقيق والحليب البودر وخليط السكر والخميرة وباقي الماء الدافئ، وقلبي حتى يذوب الدقيق تمامًا.\n" +
                " 3- غطّيه بورق النايلون واتركيه في درجة حرارة الغرفة لمدة ساعة.\n" +
                "4- سخني الزيت لقلي العوامة، ثم قلبي الخليط ثم ضعي مقدار ملعقة كبيرة من العجين في الزيت، وقلبيها حتى يُصبح لونها ذهبيًا، ثم ارفعيها من الزيت وصفيها على ورق مناديل.\n" +
                " كرري هذه العملية حتى تنتهي من العجين.\n" +
                "5- اتركيها تبرد تمامًا، ثم ضعيها في القطر الدافئ واغمسيها في الفستق المفروم أو رشي بعض القرفة.\n')");

        create_sqLiteDatabase_pastry.execSQL("insert into pastry_dp(name_pastry ,photo_pastry,dataintent_pastry)values('عقوة','oga','مقادير عمل عقوة بالحبنة     \n" +
                "\n" +
                "1- كوب دقيق ½\n" +
                "2- كوب ماء دافئ\n" +
                "3- كوب فستق حلبي مفروم \n" +
                "4- ملعقة كبيرة حليب بودر\n" +
                "5- ملعقة كبيرة سكر ناعم\n" +
                "6- ملعقة صغيرة خميرة فورية \n" +
                "7- ملعقة صغيرة فانيليا سائلة \n" +
                " \n" +



                "\n  _______________________________  " +
                "\n" +
                "طريقة تحضير عوقة بالجبنة \n" +
                "\n" +
                "1- على نار متوسطة ضعي السكر والماء وحركيه بهدوء،حتى يغلي ويذوب السكر تمامًا.\n" +
                "2- اتركيه يغلي لمدة 5 دقائق، ثم أضيفي عصير الليمون وقلبي لمدة دقيقتين ثم ارفعيه من على النار.، \n" +
                "\n" +
                "1- ضعي في وعاء صغير السكر والفانيليا والخميرة ونصف كوب من الماء الدافئ وقلبيهم جيدًا، ثم ضعيه في مكان دافئ ومظلم لمدة 15 دقيقة. \n" +
                "2- في وعاء آخر، ضعي الدقيق والحليب البودر وخليط السكر والخميرة وباقي الماء الدافئ، وقلبي حتى يذوب الدقيق تمامًا.\n" +
                " 3- غطّيه بورق النايلون واتركيه في درجة حرارة الغرفة لمدة ساعة.\n" +
                "4- سخني الزيت لقلي العوامة، ثم قلبي الخليط ثم ضعي مقدار ملعقة كبيرة من العجين في الزيت، وقلبيها حتى يُصبح لونها ذهبيًا، ثم ارفعيها من الزيت وصفيها على ورق مناديل.\n" +
                " كرري هذه العملية حتى تنتهي من العجين.\n" +
                "5- اتركيها تبرد تمامًا، ثم ضعيها في القطر الدافئ واغمسيها في الفستق المفروم أو رشي بعض القرفة.\n')");

        create_sqLiteDatabase_pastry.execSQL("insert into pastry_dp(name_pastry ,photo_pastry,dataintent_pastry)values('بيتزا تركية','tork',' مقادير عمل البيتزا التركية  \n" +
                "\n" +
                "1- كوب دقيق ½\n" +
                "2- كوب ماء دافئ\n" +
                "3- كوب فستق حلبي مفروم \n" +
                "4- ملعقة كبيرة حليب بودر\n" +
                "5- ملعقة كبيرة سكر ناعم\n" +
                "6- ملعقة صغيرة خميرة فورية \n" +
                "7- ملعقة صغيرة فانيليا سائلة \n" +
                " \n" +


                "\n  _______________________________  " +
                "\n" +
                "طريقة تحضيربيتزا تركية\n" +
                "\n" +
                " القطر:\n" +
                "\n" +
                "1- على نار متوسطة ضعي السكر والماء وحركيه بهدوء،حتى يغلي ويذوب السكر تمامًا.\n" +
                "2- اتركيه يغلي لمدة 5 دقائق، ثم أضيفي عصير الليمون وقلبي لمدة دقيقتين ثم ارفعيه من على النار.، \n" +
                "\n" +
                "\n" +
                "1- ضعي في وعاء صغير السكر والفانيليا والخميرة ونصف كوب من الماء الدافئ وقلبيهم جيدًا، ثم ضعيه في مكان دافئ ومظلم لمدة 15 دقيقة. \n" +
                "2- في وعاء آخر، ضعي الدقيق والحليب البودر وخليط السكر والخميرة وباقي الماء الدافئ، وقلبي حتى يذوب الدقيق تمامًا.\n" +
                " 3- غطّيه بورق النايلون واتركيه في درجة حرارة الغرفة لمدة ساعة.\n" +
                "4- سخني الزيت لقلي العوامة، ثم قلبي الخليط ثم ضعي مقدار ملعقة كبيرة من العجين في الزيت، وقلبيها حتى يُصبح لونها ذهبيًا، ثم ارفعيها من الزيت وصفيها على ورق مناديل.\n" +
                " كرري هذه العملية حتى تنتهي من العجين.\n" +
                "5- اتركيها تبرد تمامًا، ثم ضعيها في القطر الدافئ واغمسيها في الفستق المفروم أو رشي بعض القرفة.\n')");

        create_sqLiteDatabase_pastry.execSQL("insert into pastry_dp(name_pastry ,photo_pastry,dataintent_pastry)values('همبروجر','images','مقادير عمل همبروحر \n" +
                "\n" +
                "1- كوب دقيق ½\n" +
                "2- كوب ماء دافئ\n" +
                "3- كوب فستق حلبي مفروم \n" +
                "4- ملعقة كبيرة حليب بودر\n" +
                "5- ملعقة كبيرة سكر ناعم\n" +
                "6- ملعقة صغيرة خميرة فورية \n" +
                "7- ملعقة صغيرة فانيليا سائلة \n" +
                " \n" +

                "\n  _______________________________  " +
                "\n" +
                "طريقة تحضير سمبوسك\n" +
                "\n" +

                "1- على نار متوسطة ضعي السكر والماء وحركيه بهدوء،حتى يغلي ويذوب السكر تمامًا.\n" +
                "2- اتركيه يغلي لمدة 5 دقائق، ثم أضيفي عصير الليمون وقلبي لمدة دقيقتين ثم ارفعيه من على النار.، \n" +
                "\n" +

                "1- ضعي في وعاء صغير السكر والفانيليا والخميرة ونصف كوب من الماء الدافئ وقلبيهم جيدًا، ثم ضعيه في مكان دافئ ومظلم لمدة 15 دقيقة. \n" +
                "2- في وعاء آخر، ضعي الدقيق والحليب البودر وخليط السكر والخميرة وباقي الماء الدافئ، وقلبي حتى يذوب الدقيق تمامًا.\n" +
                " 3- غطّيه بورق النايلون واتركيه في درجة حرارة الغرفة لمدة ساعة.\n" +
                "4- سخني الزيت لقلي العوامة، ثم قلبي الخليط ثم ضعي مقدار ملعقة كبيرة من العجين في الزيت، وقلبيها حتى يُصبح لونها ذهبيًا، ثم ارفعيها من الزيت وصفيها على ورق مناديل.\n" +
                " كرري هذه العملية حتى تنتهي من العجين.\n" +
                "5- اتركيها تبرد تمامًا، ثم ضعيها في القطر الدافئ واغمسيها في الفستق المفروم أو رشي بعض القرفة.\n')");

        create_sqLiteDatabase_pastry.execSQL("insert into pastry_dp(name_pastry ,photo_pastry,dataintent_pastry)values('عش النحل','kaleat','مقادير عمل عش النحل  \n" +
                "\n" +
                "1- كوب دقيق ½\n" +
                "2- كوب ماء دافئ\n" +
                "3- كوب فستق حلبي مفروم \n" +
                "4- ملعقة كبيرة حليب بودر\n" +
                "5- ملعقة كبيرة سكر ناعم\n" +
                "6- ملعقة صغيرة خميرة فورية \n" +
                "7- ملعقة صغيرة فانيليا سائلة \n" +
                " \n" +


                "\n  _______________________________  " +
                "\n" +
                "طريقة تحضيرعقوة بالجبنة\n" +
                "\n" +
                "\n" +
                "1- على نار متوسطة ضعي السكر والماء وحركيه بهدوء،حتى يغلي ويذوب السكر تمامًا.\n" +
                "2- اتركيه يغلي لمدة 5 دقائق، ثم أضيفي عصير الليمون وقلبي لمدة دقيقتين ثم ارفعيه من على النار.، \n" +
                "\n" +
                "\n" +
                "1- ضعي في وعاء صغير السكر والفانيليا والخميرة ونصف كوب من الماء الدافئ وقلبيهم جيدًا، ثم ضعيه في مكان دافئ ومظلم لمدة 15 دقيقة. \n" +
                "2- في وعاء آخر، ضعي الدقيق والحليب البودر وخليط السكر والخميرة وباقي الماء الدافئ، وقلبي حتى يذوب الدقيق تمامًا.\n" +
                " 3- غطّيه بورق النايلون واتركيه في درجة حرارة الغرفة لمدة ساعة.\n" +
                "4- سخني الزيت لقلي العوامة، ثم قلبي الخليط ثم ضعي مقدار ملعقة كبيرة من العجين في الزيت، وقلبيها حتى يُصبح لونها ذهبيًا، ثم ارفعيها من الزيت وصفيها على ورق مناديل.\n" +
                " كرري هذه العملية حتى تنتهي من العجين.\n" +
                "5- اتركيها تبرد تمامًا، ثم ضعيها في القطر الدافئ واغمسيها في الفستق المفروم أو رشي بعض القرفة.\n')");

        create_sqLiteDatabase_pastry.execSQL("insert into pastry_dp(name_pastry ,photo_pastry,dataintent_pastry)values('أقراص شكولاته','pastry','مقادير عمل أقراص شكولاته \n" +
                "\n" +
                "1- كوب دقيق ½\n" +
                "2- كوب ماء دافئ\n" +
                "3- كوب فستق حلبي مفروم \n" +
                "4- ملعقة كبيرة حليب بودر\n" +
                "5- ملعقة كبيرة سكر ناعم\n" +
                "6- ملعقة صغيرة خميرة فورية \n" +
                "7- ملعقة صغيرة فانيليا سائلة \n" +
                " \n" +



                "\n  _______________________________  " +
                "\n" +
                "طريقة تحضير  أقراص شكولاته\n" +
                "\n" +
                "\n" +
                "1- على نار متوسطة ضعي السكر والماء وحركيه بهدوء،حتى يغلي ويذوب السكر تمامًا.\n" +
                "2- اتركيه يغلي لمدة 5 دقائق، ثم أضيفي عصير الليمون وقلبي لمدة دقيقتين ثم ارفعيه من على النار.، \n" +
                "\n" +
                "\n" +
                "1- ضعي في وعاء صغير السكر والفانيليا والخميرة ونصف كوب من الماء الدافئ وقلبيهم جيدًا، ثم ضعيه في مكان دافئ ومظلم لمدة 15 دقيقة. \n" +
                "2- في وعاء آخر، ضعي الدقيق والحليب البودر وخليط السكر والخميرة وباقي الماء الدافئ، وقلبي حتى يذوب الدقيق تمامًا.\n" +
                " 3- غطّيه بورق النايلون واتركيه في درجة حرارة الغرفة لمدة ساعة.\n" +
                "4- سخني الزيت لقلي العوامة، ثم قلبي الخليط ثم ضعي مقدار ملعقة كبيرة من العجين في الزيت، وقلبيها حتى يُصبح لونها ذهبيًا، ثم ارفعيها من الزيت وصفيها على ورق مناديل.\n" +
                " كرري هذه العملية حتى تنتهي من العجين.\n" +
                "5- اتركيها تبرد تمامًا، ثم ضعيها في القطر الدافئ واغمسيها في الفستق المفروم أو رشي بعض القرفة.\n')");








        create_sqLiteDatabase_pastry.close ();

        ArrayList<DataPastry> arrayListdataPastry = new ArrayList<> ();

        SQLiteDatabase readdatabase_pastry= MainActivity.helper.getReadableDatabase ();
        Cursor cursor = readdatabase_pastry.rawQuery ( "select * from  pastry_dp", null );
        cursor.moveToFirst ();
        while (!cursor.isAfterLast ()) {
            String name_pastry = cursor.getString ( cursor.getColumnIndex ( "name_pastry" ) );
            String data_pastry = cursor.getString ( cursor.getColumnIndex ( "dataintent_pastry" ) );
            String  photo_pastry = cursor.getString ( cursor.getColumnIndex ( "photo_pastry" ) );

            DataPastry dataPastry = new DataPastry ();
            dataPastry.setNamepastry ( name_pastry);
            dataPastry.setDatapastry ( data_pastry );
            dataPastry.setPhotopastry (photo_pastry);
            arrayListdataPastry.add ( dataPastry );

            cursor.moveToNext ();
        }
        cursor.close ();


/*  ArrayList<String> numberArrayList=new ArrayList<>();
        ArrayList<String> nameArrayList=new ArrayList<>();
        SQLiteAsllah sqLiteAsllah=new SQLiteAsllah(getApplicationContext(),"Asllah",1);
        SQLiteDatabase sqLiteDatabase=sqLiteAsllah.getReadableDatabase();
        Cursor cursor=sqLiteDatabase.rawQuery("select * from asllah",null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            int id=cursor.getInt(cursor.getColumnIndex("id"));
            numberArrayList.add(String.valueOf(id));
            nameArrayList.add(cursor.getString(cursor.getColumnIndex("name")));
            cursor.moveToNext();
        }
        cursor.close();
        RecyclerView recycler_view=findViewById(R.id.recycler_view);
        AdapterAsllah adapterAsllah=new AdapterAsllah(AsllahActivity.this,R.layout.asllah,numberArrayList,nameArrayList);
        RecyclerView.LayoutManager layoutManager=new GridLayoutManager(AsllahActivity.this,1);
        recycler_view.setHasFixedSize(true);
        recycler_view.setLayoutManager(layoutManager);
        recycler_view.setAdapter(adapterAsllah);*/

//        DataPastry dataPastry=new DataPastry ();
//        dataPastry.setNamepastry ("بسبوسة");
//        dataPastry.setDatapastry ( "اﻟﺤﺮﻳﺮة ﺷﻮرﺑﺔ ﻣﻐﺮﺑﻴﺔ رﻣﻀﺎﻧﻴﺔ . واﻟﺤﺮﻳﺮة وإن آﺎن أﺻﻠﻬﺎ ﻣﻐﺮﺑﻲ، إﻻ أﻧﻬﺎ إﻧﺘﺸﺮت ﻓﻲ اﻟﻌﺎﻟﻢ اﻟﻌﺮﺑﻲ وأﺻﺒﺤﺖ ﻃﺒﻘﺎ ﻣﻔﻀﻼ، ﺧﺎﺻﺔ ﻓﻲ ﺷﻬﺮ رﻣﻀﺎن اﻟﻤﺒﺎرك.  اﻟﻤﻘﺎدﻳﺮ    آﻴﻠﻮ واﻟﺪهﻦ ٢/١ U ﻣﻜﻌﺒﺎت ﻟﺤﻢ ﻏﻨﻢ ﺧﺎﻟﻴﺔ ﻣﻦ اﻟﻌﻈﻢ      ﻣﻠﻌﻘﺔ ﺻﻐﻴﺮة آﺮآﻢ ١ U ﻣﻠﻌﻘﺔ ﺻﻐﻴﺮة ﻣﻄﺤﻮن ١ U ﻓﻠﻔﻞ أﺳﻮد    ﻣﻠﻌﻘﺔ ﺻﻐﻴﺮة ﻣﻄﺤﻮﻧﺔ ١ U ﻗﺮﻓﺔ      ﻣﻠﻌﻘﺔ ﺻﻐﻴﺮة ٤/١ U زﻧﺠﺒﻴﻞ ﺑﻮدرة  ﻣﻠﻌﻘﺔ ﺻﻐﻴﺮة ﻣﻄﺤﻮن ٤/١ U ﻓﻠﻔﻞ أﺣﻤﺮ ﺣﺎر    ﻣﻠﻌﻘﺔ زﺑﺪة ٢ U ﺳﻤﻨﺔ أو      آﻮب آﺮﻓﺲ ٤/٣ U ﻣﻔﺮوﻣﺔ ١ U ﺑﺼﻠﺔ،    ﻣﻔﺮوﻣﺔ ١ U ﺑﺼﻠﺔ ﺣﻤﺮاء    آﻮب ﻣﻔﺮوﻣﺔ ٢/١ U آﺰﺑﺮة ﺧﻀﺮاء    ﻣﺘﻮﺳ ٥ U ﺣﺒﺎت ﻃﻤﺎﻃﻢ اﻟﺤﺠﻢ ﻄﺔ      آﻮب ﻣﺎء ٧ U آﻮب أﺧﻀﺮ ٤/٣ U ﻋﺪس   U   ﻏﺮام(ﻣﺎﺋﻬﺎ ٣٧٥) ﻋﻠﺒﺔ ﺣﻤﺺ    ﻣﺼﻔﺎة ﻣﻦ ،   ﻏﺮام ١٠٠ U ﻣﻌﻜﺮوﻧﺔ ﻋﻴﺪان رﻓﻴﻌﺔ ﻣﺜﻞ اﻟﺸﻌﻴﺮﻳﺔ    ﺑﻴﺾ ٢ U ﻟﻴﻤﻮﻧﺔ U ﻋﺼﻴﺮ   اﻟﻄﺮﻳﻘﺔ   ١.  ﻓﻲ ﻗﺪر آﺒﻴﺮ  ﺗﻮﺿﻊ اﻟﻠﺤﻤﺔ ﻣﻊ اﻟﻜﺮآﻢ واﻟﻔﻠﻔﻞ اﻷﺳﻮد واﻟﻘﺮﻓﺔ واﻟﺰﻧﺠﺒﻴﻞ واﻟﻔﻠﻔﻞ ، اﻷﺣﻤﺮ واﻟﺴﻤﻨﺔ واﻟﻜﺮﻓﺲ واﻟﺒﺼﻞ واﻟ ﻜﺰﺑﺮة وﺗﻘﻠﺐ ﻣﻌﺎ ﻋﻠﻰ ﻧﺎر هﺎدﺋﺔ ﺑﻴﻦ اﻟﺤﻴﻦ واﻵﺧﺮ  . دﻗﺎﺋﻖ ٥ ﻟﻤﺪة ﺗﻘﺸﺮ اﻟﻄﻤﺎﻃﻢ وﺗﻘﻄﻊ ﻣﻜﻌﺒﺎت آﺒﻴﺮة  وﺗﻀﺎف ﻟﻠﺨﻠﻴﻂ وﺗﺘﺮك اﻟﻘﺪر ﻋﻠﻰ  . دﻗﻴﻘﺔ ١٥ ﻧﺎر هﺎدﺋﺔ ﻟﻤﺪة ٢.  ﻳﻀﺎف اﻟﻤﺎء واﻟﻌﺪس ﻟﻠﻘﺪر وﺗﻌﻠَﻰ اﻟﻨﺎر ﺣﺘﻰ ﻳﻐﻠﻲ اﻟﺨﻠﻴﻂ، ﺑﻌﺪ اﻟﻐﻠﻴﺎن ﺗﻮﻃﻰ اﻟﻨﺎر وﻳﻐﻄﻰ اﻟﻘﺪر وﻳﺘﺮك اﻟﻘﺪر ﻋﻠﻰ ﻧﺎر ﺳﺎﻋﺘﻴﻦ هﺎدﺋﺔ ﻟﻤﺪة .  ٣.  ﻗﺒﻞ إﻧﺘﻬﺎء اﻟﺸﻮرﺑﺔ ﺑﻌﺸﺮ دﻗﺎﺋﻖ ﺗﺮﻓﻊ اﻟﺤﺮارة ﻗﻠﻴﻼ ﻟﺘﺼﺒﺢ ﻣﺘﻮﺳﻄﺔ، ﺗﻀﺎف ﺣﺒﺎت اﻟﺤﻤﺺ واﻟﻤﻌﻜﺮوﻧﺔ وﺗﺘﺮك ﻋﻠﻰ اﻟﻨﺎر ﻟﻌﺸﺮ دﻗﺎﺋﻖ ﺣﻨﻰ ﺗﺴﺘﻮي اﻟﻤﻌﻜﺮوﻧﺔ . ﻳﻀﺎف ﻋﺼﻴﺮ اﻟﻠﻴﻤﻮن واﻟﺒﻴﺾ، ﺗﺘﺮك اﻟﻨﺎر ﻟﺪﻗﻴﻘﺘﻴﻦ ﻟﻴﺴﺘﻮي اﻟﺒﻴﺾ ﺛﻢ ﺗﺮﻓﻊ اﻟﺸﻮرﺑﺔ وﺗﻘﺪم" );
//
//        dataPastry.setPhotopastry ("imag2");
//
//        DataPastry dataPastry1=new DataPastry ();
//        dataPastry1.setNamepastry ("مبروشة");
//        dataPastry1.setDatapastry ( "dfddddddsdf" );
//        dataPastry1.setPhotopastry ("pasbosa");

//        DataPastry dataPastry2=new DataPastry ();
//        dataPastry2.setNamepastry ("عوامة");
//        dataPastry2.setDatapastry ( "dfsdddddf" );
//        dataPastry2.setPhotopastry ("imag2");
//
//        DataPastry dataPastry3=new DataPastry ();
//        dataPastry3.setNamepastry ("حلبة");
//        dataPastry3.setDatapastry ( "dfsdfdsfdf" );
//        dataPastry3.setPhotopastry ("imag1");
//
//        DataPastry dataPastry4=new DataPastry ();
//        dataPastry4.setNamepastry ("كعك");
//        dataPastry4.setDatapastry ( "dfsdsfdsfdf" );
//        dataPastry4.setPhotopastry ("imag1");
//
//        DataPastry dataPastry5=new DataPastry ();
//        dataPastry5.setNamepastry ("عوقة");
//        dataPastry5.setDatapastry ( "dfsdddddf" );
//        dataPastry5.setPhotopastry ("pastry");
//
//        DataPastry dataPastry6=new DataPastry ();
//        dataPastry6.setNamepastry ("بسبوسة");
//        dataPastry6.setDatapastry ( "ddddddd" );
//        dataPastry6.setPhotopastry ("imag3");
//
//        DataPastry dataPastry7=new DataPastry ();
//        dataPastry7.setNamepastry ("بسبوسة");
//        dataPastry7.setDatapastry ( "dfdfsddddadfsdf" );
//        dataPastry7.setPhotopastry ("pasbosa");
//
//        DataPastry dataPastry8=new DataPastry ();
//        dataPastry8.setNamepastry ("بسبوسة");
//        dataPastry8.setDatapastry ( "dddddsfdsffsdf" );
//        dataPastry8.setPhotopastry ("imag5");
//
//        DataPastry dataPastry9=new DataPastry ();
//        dataPastry9.setNamepastry ("بسبوسة");
//        dataPastry9.setDatapastry ( "dfsddddfasdff" );
//        dataPastry9.setPhotopastry ("imag1");
//
//        ArrayList<DataPastry> arrayListdataPastry=new ArrayList<> (  );
//        arrayListdataPastry.add (dataPastry);
//        arrayListdataPastry.add (dataPastry1);
//        arrayListdataPastry.add (dataPastry2);
//        arrayListdataPastry.add (dataPastry3);
//        arrayListdataPastry.add (dataPastry4);
//        arrayListdataPastry.add (dataPastry5);
//        arrayListdataPastry.add (dataPastry6);
//        arrayListdataPastry.add (dataPastry7);
//        arrayListdataPastry.add (dataPastry8);
//        arrayListdataPastry.add (dataPastry9);
        RecyclerView recyclerViewsweets=findViewById ( R.id.recycleviewpastry );
        MypastryAdapter mySweetsAdapter=new MypastryAdapter (arrayListdataPastry,R.layout.desginpastry);


        recyclerViewsweets.setAdapter (mySweetsAdapter);
        DividerItemDecoration did=new DividerItemDecoration (getApplicationContext(),DividerItemDecoration.HORIZONTAL);
        GridLayoutManager gridLayoutManager=new GridLayoutManager ( getApplicationContext (),2 );
        recyclerViewsweets.setLayoutManager (gridLayoutManager);

    }

    private void setActionBar(Toolbar toolbarpastry) {
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
}
