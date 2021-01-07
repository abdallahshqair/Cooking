package com.example.abdallah;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class sweets extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_sweets );
        final Toolbar toolbar_sweets=findViewById (R.id.toolbar_sweets );
        setActionBar ( toolbar_sweets );
        final ImageView backesweets=findViewById ( R.id.backesweets );
        backesweets.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                setResult(100);
                finish();
            }
        } );



        SQLiteDatabase create_sqLiteDatabase_sweets= MainActivity.helper.getWritableDatabase ();
        create_sqLiteDatabase_sweets.execSQL("insert into sweets_dp(name_sweets,photo_sweets,dataintent_sweets)values('نمورة فلسطينية','namora','*مقادير النمورة الفلسطينية\n" +
                "\n" +
                "1- كيلو دقيق السميد.\n" +
                "3 -2أكواب قطر (شربات) ساخن. \n" +
                "2 -3كوب سكر.\n" +

                "4- 4ملاعق كبيرة سمنة بلدي ذائبة.\n" +
                "2 -5ملعقة كبيرة طحينة. \n" +
                "3 -6ملعقة صغيرة بيكنج باودر. \n" +
                "1 -7كوب ماء.\n" +
                " 8- كوب لبن رائب. \n" +
                "9- كوب زيت.\n" +
                "10- لوز مقشر أو فستق أو بندق أو عين جمل حسبما ترغبين\n" +
                "\n  _______________________________  " +
                "\n" +
                "\n*طريقة تحضير النمورة الفلسطينية\n" +
                "\n" +
                "1- سخني الفرن عند درجة حرارة 180. \n" +
                "2- في وعاء ضعي السميد والسكر وجوز الهند والبكينج بودر. \n" +
                "3- أضيفي الماء تدريجيًا مع العجن حتى يُصبح العجين مثل الرمل المبلول عند الضغط عليه يتماسك. \n" +
                "4- ادهني الصينية بالطحينة ثم ضعي العجين واضغطي عليه بيديك حتى يتساوى في الصينية ويلتصق ببعضه. \n" +
                "5- صبي الزيت فوق العجينة وادهني الوجه كله بالزيت.\n" +
                "6- قطعي النمورة إلى مكعبات وضعي في كل مكعب حبة لوز. \n" +
                "7- ضعي الصينية في الفرن لمدة 15 دقيقة. \n" +
                "8- أخرجي الصينية ووزعي اللبن وادهنيه على الوجه ثم أدخليها مرة أخرى لمدة 15 دقيقة حتى تنضج ويصبح لونها ذهبيًا. \n" +
                "9- أخرجيها ثم وزعي الشربات الساخن على الصينية كلها ثم السمنة الذائبة واتركيها جانبًا لتبرد.\n" +
                "10- قدميها مع القهوة أو الشاي- ¼ 1 -كوب جوز هند مبشور.')");
        create_sqLiteDatabase_sweets.execSQL("insert into sweets_dp(name_sweets,photo_sweets,dataintent_sweets)values('كب كيك','kabkak','*مقادير كب كيك الشوكولاتة\n" +
                "\n" +
                " للكيك: \n" +
                "\n" +
                "1- كوب وربع دقيق \n" +
                "2- ثلاثة أرباع الكوب من الكاكاو \n" +
                "3- نصف ملعقة باكينج باودر\n" +
                "4- كوب سكر ناعم بودرة\n" +
                "5- بيضتان \n" +
                "6- ملعقة فانيليا\n" +
                " 7- كوب ونصف حليب\n" +
                "8- نصف كوب زيت\n" +
                " لصوص الشوكولاتة:\n" +
                "\n" +

                "2- 1كوب سكر ناعم بودرة \n" +
                "2- ربع كوب كاكاو \n" +
                "3- ربع كوب حليب\n" +
                "4- شوكولاتة مبشورة \n" +

                "\n  _______________________________  " +

                "\n" +

                "*طريقة تحضير كب كيك الشوكولاتة .\n" +
                "\n" +
                "1- سخني الفرن إلى درجة حرارة 180 درجة مئوية. \n" +
                "2- حضري قوالب الكب كيك، وضعي داخلها الأكواب الورقية. \n" +
                "3- اخلطي المكونات الجافة، وهي الدقيق وبودرة الكاكاو والبكينج باودر والسكر.\n" +
                "4- اخفقي المكونات السائلة وهي البيض والفانيليا والحليب والزيت. \n" +
                "5- أضيفي المكونات الجافة على السائلة واخفقي جيدًا.\n" +
                "6- وزعي الخليط على القوالب واخبزيها لمدة 30 دقيقة.\n" +
                "7- حضري صوص الشوكولاتة على حمام ماء ساخن بوضع الحليب والكاكاو والسكر حتى يمتزج ويسمك. \n" +
                "8- اتركي الكيك ليبرد ثم غطيه بصلصة الشوكولاتة ورشي الشوكولاتة المبشورة\n')");

        create_sqLiteDatabase_sweets.execSQL("insert into sweets_dp(name_sweets,photo_sweets,dataintent_sweets)values('عوامة','awma','مقادير عوامة مقرمشة \n" +
                "\n" +
                "1- كوب دقيق ½\n" +
                "2- كوب ماء دافئ\n" +
                "3- كوب فستق حلبي مفروم \n" +
                "4- ملعقة كبيرة حليب بودر\n" +
                "5- ملعقة كبيرة سكر ناعم\n" +
                "6- ملعقة صغيرة خميرة فورية \n" +
                "7- ملعقة صغيرة فانيليا سائلة \n" +
                " \n" +
                "القطر:\n" +
                " \n" +
                " 2 -1كوب سكر  \n" +
                "2- كوب ماء\n" +
                "2 -3ملعقة كبيرة عصير ليمون \n" +

                "\n  _______________________________  " +
                "\n" +
                "طريقة تحضير عوامة مقرمشة\n" +
                "\n" +
                " القطر:\n" +
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






        create_sqLiteDatabase_sweets.execSQL("insert into sweets_dp(name_sweets,photo_sweets,dataintent_sweets)values('كعك','kaak','*مقادير عمل الكعك\n" +
                "\n" +
                "1- كيلو دقيق السميد.\n" +
                "3 -2أكواب قطر (شربات) ساخن. \n" +
                "2 -3كوب سكر.\n" +

                "4- 4ملاعق كبيرة سمنة بلدي ذائبة.\n" +
                "2 -5ملعقة كبيرة طحينة. \n" +
                "3 -6ملعقة صغيرة بيكنج باودر. \n" +
                "1 -7كوب ماء.\n" +
                " 8- كوب لبن رائب. \n" +
                "9- كوب زيت.\n" +
                "10- لوز مقشر أو فستق أو بندق أو عين جمل حسبما ترغبين\n" +
                "\n  _______________________________  " +
                "\n" +
                "\n*طريقة تحضير الكعك\n" +
                "\n" +
                "1- سخني الفرن عند درجة حرارة 180. \n" +
                "2- في وعاء ضعي السميد والسكر وجوز الهند والبكينج بودر. \n" +
                "3- أضيفي الماء تدريجيًا مع العجن حتى يُصبح العجين مثل الرمل المبلول عند الضغط عليه يتماسك. \n" +
                "4- ادهني الصينية بالطحينة ثم ضعي العجين واضغطي عليه بيديك حتى يتساوى في الصينية ويلتصق ببعضه. \n" +
                "5- صبي الزيت فوق العجينة وادهني الوجه كله بالزيت.\n" +
                "6- قطعي النمورة إلى مكعبات وضعي في كل مكعب حبة لوز. \n" +
                "7- ضعي الصينية في الفرن لمدة 15 دقيقة. \n" +
                "8- أخرجي الصينية ووزعي اللبن وادهنيه على الوجه ثم أدخليها مرة أخرى لمدة 15 دقيقة حتى تنضج ويصبح لونها ذهبيًا. \n" +
                "9- أخرجيها ثم وزعي الشربات الساخن على الصينية كلها ثم السمنة الذائبة واتركيها جانبًا لتبرد.\n" +
                "10- قدميها مع القهوة أو الشاي- ¼ 1 -كوب جوز هند مبشور.')");





        create_sqLiteDatabase_sweets.execSQL("insert into sweets_dp(name_sweets,photo_sweets,dataintent_sweets)values('كيك','keak','*مقادير عمل كيك \n" +
                "\n" +

                "\n" +
                "1- كوب وربع دقيق \n" +
                "2- ثلاثة أرباع الكوب من الكاكاو \n" +
                "3- نصف ملعقة باكينج باودر\n" +
                "4- كوب سكر ناعم بودرة\n" +
                "5- بيضتان \n" +
                "6- ملعقة فانيليا\n" +
                " 7- كوب ونصف حليب\n" +
                "8- نصف كوب زيت\n" +
                " لصوص الشوكولاتة:\n" +
                "\n" +

                "2- 1كوب سكر ناعم بودرة \n" +
                "2- ربع كوب كاكاو \n" +
                "3- ربع كوب حليب\n" +


                "\n  _______________________________  " +
                "\n" +
                "*طريقة تحضير الكيك  .\n" +
                "\n" +
                "1- سخني الفرن إلى درجة حرارة 180 درجة مئوية. \n" +
                "2- حضري قوالب الكب كيك، وضعي داخلها الأكواب الورقية. \n" +
                "3- اخلطي المكونات الجافة، وهي الدقيق وبودرة الكاكاو والبكينج باودر والسكر.\n" +
                "4- اخفقي المكونات السائلة وهي البيض والفانيليا والحليب والزيت. \n" +
                "5- أضيفي المكونات الجافة على السائلة واخفقي جيدًا.\n" +
                "6- وزعي الخليط على القوالب واخبزيها لمدة 30 دقيقة.\n" +
                "7- حضري صوص الشوكولاتة على حمام ماء ساخن بوضع الحليب والكاكاو والسكر حتى يمتزج ويسمك. \n" +
                "8- اتركي الكيك ليبرد ثم غطيه بصلصة الشوكولاتة ورشي الشوكولاتة المبشورة\n')");

        create_sqLiteDatabase_sweets.execSQL("insert into sweets_dp(name_sweets,photo_sweets,dataintent_sweets)values('بسبوسة','pasbosa','مقادير بسبوسة \n" +
                "\n" +
                "1- كوب دقيق ½\n" +
                "2- كوب ماء دافئ\n" +
                "3- كوب فستق حلبي مفروم \n" +
                "4- ملعقة كبيرة حليب بودر\n" +
                "5- ملعقة كبيرة سكر ناعم\n" +
                "6- ملعقة صغيرة خميرة فورية \n" +
                "7- ملعقة صغيرة فانيليا سائلة \n" +
                " \n" +
                "القطر:\n" +
                " \n" +
                " 2 -1كوب سكر  \n" +
                "2- كوب ماء\n" +
                "2 -3ملعقة كبيرة عصير ليمون \n" +

                "\n  _______________________________  " +
                "\n" +
                "طريقة عمل بسبوسة\n" +
                "\n" +
                " القطر:\n" +
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
        create_sqLiteDatabase_sweets.execSQL("insert into sweets_dp(name_sweets,photo_sweets,dataintent_sweets)values('بتيفور','betfor','*مقادير عمل البيتفور\n" +
                "\n" +
                "1- كيلو دقيق السميد.\n" +
                "3 -2أكواب قطر (شربات) ساخن. \n" +
                "2 -3كوب سكر.\n" +

                "4- 4ملاعق كبيرة سمنة بلدي ذائبة.\n" +
                "2 -5ملعقة كبيرة طحينة. \n" +
                "3 -6ملعقة صغيرة بيكنج باودر. \n" +
                "1 -7كوب ماء.\n" +
                " 8- كوب لبن رائب. \n" +
                "9- كوب زيت.\n" +
                "10- لوز مقشر أو فستق أو بندق أو عين جمل حسبما ترغبين\n" +
                "\n  _______________________________  " +
                "\n" +
                "\n*طريقة تحضير بتيفور\n" +
                "\n" +
                "1- سخني الفرن عند درجة حرارة 180. \n" +
                "2- في وعاء ضعي السميد والسكر وجوز الهند والبكينج بودر. \n" +
                "3- أضيفي الماء تدريجيًا مع العجن حتى يُصبح العجين مثل الرمل المبلول عند الضغط عليه يتماسك. \n" +
                "4- ادهني الصينية بالطحينة ثم ضعي العجين واضغطي عليه بيديك حتى يتساوى في الصينية ويلتصق ببعضه. \n" +
                "5- صبي الزيت فوق العجينة وادهني الوجه كله بالزيت.\n" +
                "6- قطعي النمورة إلى مكعبات وضعي في كل مكعب حبة لوز. \n" +
                "7- ضعي الصينية في الفرن لمدة 15 دقيقة. \n" +
                "8- أخرجي الصينية ووزعي اللبن وادهنيه على الوجه ثم أدخليها مرة أخرى لمدة 15 دقيقة حتى تنضج ويصبح لونها ذهبيًا. \n" +
                "9- أخرجيها ثم وزعي الشربات الساخن على الصينية كلها ثم السمنة الذائبة واتركيها جانبًا لتبرد.\n" +
                "10- قدميها مع القهوة أو الشاي- ¼ 1 -كوب جوز هند مبشور.')");
        create_sqLiteDatabase_sweets.execSQL("insert into sweets_dp(name_sweets,photo_sweets,dataintent_sweets)values('قطايف','qatayef','*مقادير عمل القطايف\n" +


                "\n" +
                "1- كوب وربع دقيق \n" +
                "2- ثلاثة أرباع الكوب من الكاكاو \n" +
                "3- نصف ملعقة باكينج باودر\n" +
                "4- كوب سكر ناعم بودرة\n" +
                "5- بيضتان \n" +
                "6- ملعقة فانيليا\n" +
                " 7- كوب ونصف حليب\n" +
                "8- نصف كوب زيت\n" +
                " لصوص الشوكولاتة:\n" +
                "\n" +

                "2- 1كوب سكر ناعم بودرة \n" +
                "2- ربع كوب كاكاو \n" +
                "3- ربع كوب حليب\n" +
                "4- شوكولاتة مبشورة \n" +

                "\n  _______________________________  " +
                "*طريقة تحضير القطايف.\n" +
                "\n" +
                "1- سخني الفرن إلى درجة حرارة 180 درجة مئوية. \n" +
                "2- حضري قوالب الكب كيك، وضعي داخلها الأكواب الورقية. \n" +
                "3- اخلطي المكونات الجافة، وهي الدقيق وبودرة الكاكاو والبكينج باودر والسكر.\n" +
                "4- اخفقي المكونات السائلة وهي البيض والفانيليا والحليب والزيت. \n" +
                "5- أضيفي المكونات الجافة على السائلة واخفقي جيدًا.\n" +
                "6- وزعي الخليط على القوالب واخبزيها لمدة 30 دقيقة.\n" +
                "7- حضري صوص الشوكولاتة على حمام ماء ساخن بوضع الحليب والكاكاو والسكر حتى يمتزج ويسمك. \n')");

        create_sqLiteDatabase_sweets.execSQL("insert into sweets_dp(name_sweets,photo_sweets,dataintent_sweets)values('كنافة','knafa','مقادير عمل الكنافة \n" +
                "\n" +
                "1- كوب دقيق ½\n" +
                "2- كوب ماء دافئ\n" +
                "3- كوب فستق حلبي مفروم \n" +
                "4- ملعقة كبيرة حليب بودر\n" +
                "5- ملعقة كبيرة سكر ناعم\n" +
                "6- ملعقة صغيرة خميرة فورية \n" +
                "7- ملعقة صغيرة فانيليا سائلة \n" +
                " \n" +
                "القطر:\n" +
                " \n" +
                " 2 -1كوب سكر  \n" +
                "2- كوب ماء\n" +
                "2 -3ملعقة كبيرة عصير ليمون \n" +

                "\n  _______________________________  " +
                "\n" +
                "طريقة تحضير الكنافة\n" +
                "\n" +
                " القطر:\n" +
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



        create_sqLiteDatabase_sweets.execSQL("insert into sweets_dp(name_sweets,photo_sweets,dataintent_sweets)values('حلب','hlab','مقادير عمل الحلب \n" +
                "\n" +
                "1- كوب دقيق ½\n" +
                "2- كوب ماء دافئ\n" +
                "3- كوب فستق حلبي مفروم \n" +
                "4- ملعقة كبيرة حليب بودر\n" +
                "5- ملعقة كبيرة سكر ناعم\n" +
                "6- ملعقة صغيرة خميرة فورية \n" +
                "7- ملعقة صغيرة فانيليا سائلة \n" +
                " \n" +
                "القطر:\n" +
                " \n" +
                " 2 -1كوب سكر  \n" +
                "2- كوب ماء\n" +
                "2 -3ملعقة كبيرة عصير ليمون \n" +

                "\n  _______________________________  " +
                "\n" +
                "طريقة تحضير الحلب\n" +
                "\n" +
                " القطر:\n" +
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
        create_sqLiteDatabase_sweets.execSQL("insert into sweets_dp(name_sweets,photo_sweets,dataintent_sweets)values('حلا القهوة','hloyat','مقادير عمل حلى القهوة \n" +
                "\n" +
                "1- كوب دقيق ½\n" +
                "2- كوب ماء دافئ\n" +
                "3- كوب فستق حلبي مفروم \n" +
                "4- ملعقة كبيرة حليب بودر\n" +
                "5- ملعقة كبيرة سكر ناعم\n" +
                "6- ملعقة صغيرة خميرة فورية \n" +
                "7- ملعقة صغيرة فانيليا سائلة \n" +
                " \n" +
                "القطر:\n" +
                " \n" +
                " 2 -1كوب سكر  \n" +
                "2- كوب ماء\n" +
                "2 -3ملعقة كبيرة عصير ليمون \n" +

                "\n  _______________________________  " +
                "\n" +
                "طريقة تحضيرحلا القهوة\n" +
                "\n" +
                " القطر:\n" +
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




        create_sqLiteDatabase_sweets.close ();
























        ArrayList<Datasweets> arrayListdatasweets = new ArrayList<> ();

        SQLiteDatabase readdatabase_sweets= MainActivity.helper.getReadableDatabase ();
        Cursor cursor = readdatabase_sweets.rawQuery ( "select * from  sweets_dp", null );
        cursor.moveToFirst ();
        while (!cursor.isAfterLast ()) {
            String name_sweets = cursor.getString ( cursor.getColumnIndex ( "name_sweets" ) );
            String dataintent_sweets = cursor.getString ( cursor.getColumnIndex ( "dataintent_sweets" ) );
            String  photo_sweets = cursor.getString ( cursor.getColumnIndex ( "photo_sweets" ) );
//            int photosweets = getResources().getIdentifier(photo_sweets,"drawable",getPackageName());

            Datasweets datasweets = new Datasweets ();
            datasweets.setNamesweets ( name_sweets);
            datasweets.setDatasweets ( dataintent_sweets );
            datasweets.setPhotosweets (photo_sweets);
            arrayListdatasweets.add ( datasweets );

            cursor.moveToNext ();
        }
        cursor.close ();

//
//        Datasweets datasweets=new Datasweets ();
//        datasweets.setNamesweets ("بسبوسة");
//        datasweets.setDatasweets ( "dfsdf" );
//        datasweets.setPhotosweets ("pasbosa");
//
//        Datasweets datasweets1=new Datasweets ();
//        datasweets1.setNamesweets ("مبروشة");
//        datasweets1.setDatasweets ( "dfsdf" );
//        datasweets1.setPhotosweets ("imag5");
//
//        Datasweets datasweets2=new Datasweets ();
//        datasweets2.setNamesweets ("عوامة");
//        datasweets2.setDatasweets ( "dfsdf" );
//        datasweets2.setPhotosweets ("imag2");
//
//        Datasweets datasweets3=new Datasweets ();
//        datasweets3.setNamesweets ("حلبة");
//        datasweets3.setDatasweets ( "dfsdfdsfdf" );
//        datasweets3.setPhotosweets ("imag1");
//
//        Datasweets datasweets4=new Datasweets ();
//        datasweets4.setNamesweets ("كعك");
//        datasweets4.setDatasweets ( "dfsdsfdsfdf" );
//        datasweets4.setPhotosweets ("imag1");
//
//        Datasweets datasweets5=new Datasweets ();
//        datasweets5.setNamesweets ("عوقة");
//        datasweets5.setDatasweets ( "dfsdf" );
//        datasweets5.setPhotosweets ("imag2");
//
//        Datasweets datasweets6=new Datasweets ();
//        datasweets6.setNamesweets ("بسبوسة");
//        datasweets6.setDatasweets ( "dfsddfsdff" );
//        datasweets6.setPhotosweets ("imag3");
//
//        Datasweets datasweets7=new Datasweets ();
//        datasweets7.setNamesweets ("بسبوسة");
//        datasweets7.setDatasweets ( "dfdfsadfsdf" );
//        datasweets7.setPhotosweets ("imag5");
//
//        Datasweets datasweets8=new Datasweets ();
//        datasweets8.setNamesweets ("بسبوسة");
//        datasweets8.setDatasweets ( "ddsfdsffsdf" );
//        datasweets8.setPhotosweets ("pasbosa");
//
//        Datasweets datasweets9=new Datasweets ();
//        datasweets9.setNamesweets ("بسبوسة");
//        datasweets9.setDatasweets ( "dfsddfasdff" );
//        datasweets9.setPhotosweets ("imag1");
//        ArrayList<Datasweets>arrayListdatasweets=new ArrayList<> (  );
//        arrayListdatasweets.add (datasweets);
//        arrayListdatasweets.add (datasweets1);
//        arrayListdatasweets.add (datasweets2);
//        arrayListdatasweets.add (datasweets3);
//        arrayListdatasweets.add (datasweets4);
//        arrayListdatasweets.add (datasweets5);
//        arrayListdatasweets.add (datasweets6);
//        arrayListdatasweets.add (datasweets7);
//        arrayListdatasweets.add (datasweets8);
//        arrayListdatasweets.add (datasweets9);


        RecyclerView recyclerViewsweets=findViewById ( R.id.recyclerviewsweets );
        MySweetsAdapter mySweetsAdapter=new MySweetsAdapter (arrayListdatasweets,R.layout.desginsweets);


//        LinearLayoutManager llm=new LinearLayoutManager (getApplicationContext());
//        llm.setOrientation(LinearLayoutManager.VERTICAL);

//        recyclerViewsweets.setLayoutManager(llm);
        recyclerViewsweets.setAdapter (mySweetsAdapter);
        DividerItemDecoration did=new DividerItemDecoration (getApplicationContext(),DividerItemDecoration.VERTICAL);
        GridLayoutManager gridLayoutManager=new GridLayoutManager ( getApplicationContext (),2 );
        recyclerViewsweets.setLayoutManager (gridLayoutManager);




//    }
    }

    private void setActionBar(Toolbar toolbar_sweets) {

    }


}
