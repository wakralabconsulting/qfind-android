package qfind.com.qfindappandroid;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Locale;
import butterknife.BindView;
import butterknife.ButterKnife;
import cn.lightsky.infiniteindicator.IndicatorConfiguration;
import cn.lightsky.infiniteindicator.InfiniteIndicator;
import cn.lightsky.infiniteindicator.OnPageClickListener;
import cn.lightsky.infiniteindicator.Page;
import qfind.com.qfindappandroid.categorycontaineractivity.ContainerActivity;
import qfind.com.qfindappandroid.categoryfragment.CategoryFragmentModel;
import qfind.com.qfindappandroid.categoryfragment.PicassoLoader;

import static cn.lightsky.infiniteindicator.IndicatorConfiguration.LEFT;
import static cn.lightsky.infiniteindicator.IndicatorConfiguration.RIGHT;


public class MainActivity extends AppCompatActivity implements  ViewPager.OnPageChangeListener, OnPageClickListener,NavigationView.OnNavigationItemSelectedListener  {

    @BindView(R.id.toolbar)
    android.support.v7.widget.Toolbar toolbar;
    @BindView(R.id.drawer)
    DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    @BindView(R.id.findByCategoryBtn)
    Button findByCategoryBtn;
    @BindView(R.id.hamburger_menu)
    ImageView hamburgerMenu;
    Locale myLocale;
    private InfiniteIndicator mAnimCircleIndicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setHomeButtonEnabled(true);
        mAnimCircleIndicator = (InfiniteIndicator)findViewById(R.id.indicator_default_circle);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.setDrawerListener(toggle);
        toggle.setDrawerIndicatorEnabled(false);
        toggle.syncState();

        hamburgerMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (drawerLayout.isDrawerOpen(Gravity.END)) {
                    drawerLayout.closeDrawer(Gravity.END);
                } else {
                    drawerLayout.openDrawer(Gravity.END);
                }
            }
        });

        findByCategoryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ContainerActivity.class);
                startActivity(i);
                finish();
            }
        });

        loadAdsToSlider();


    }

    public void setLocale(String lang) {
        Configuration configuration = getResources().getConfiguration();
        configuration.setLayoutDirection(new Locale(lang));
        getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());

        myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        Intent refresh = new Intent(MainActivity.this, MainActivity.class);
        this.overridePendingTransition(0, 0);
        this.finish();
        startActivity(refresh);
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(Gravity.END)) {
            drawerLayout.closeDrawer(Gravity.END);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.END);
        return true;
    }
    public void loadAdsToSlider(){
        ArrayList<Page> adsImages;
        CategoryFragmentModel  categoryFragmentModel = new CategoryFragmentModel();
        adsImages = categoryFragmentModel.getAdsImages();
        if (getResources().getConfiguration().locale.getLanguage().equals("en")) {
            IndicatorConfiguration configuration = new IndicatorConfiguration.Builder()
                    .imageLoader(new PicassoLoader())
                    .isStopWhileTouch(true)
                    .onPageChangeListener(this)
                    .scrollDurationFactor(6)
                    .internal(3000)
                    .isLoop(true)
                    .isAutoScroll(true)
                    .onPageClickListener(this)
                    .direction(LEFT)
                    .position(IndicatorConfiguration.IndicatorPosition.Center_Bottom)
                    .build();
            mAnimCircleIndicator.init(configuration);
            mAnimCircleIndicator.notifyDataChange(adsImages);
        } else {
            IndicatorConfiguration configuration = new IndicatorConfiguration.Builder()
                    .imageLoader(new PicassoLoader())
                    .isStopWhileTouch(true)
                    .onPageChangeListener(this)
                    .internal(3000)
                    .scrollDurationFactor(6)
                    .isLoop(true)
                    .isAutoScroll(true)
                    .onPageClickListener(this)
                    .direction(RIGHT)
                    .position(IndicatorConfiguration.IndicatorPosition.Center_Bottom)
                    .build();
            mAnimCircleIndicator.init(configuration);
            mAnimCircleIndicator.notifyDataChange(adsImages);
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onPageClick(int position, Page page) {

    }
}
