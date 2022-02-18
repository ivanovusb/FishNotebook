package com.example.fishnotebook;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toolbar;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fishnotebook.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;
    public ListView list;
    public String[] array;
    public ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list = findViewById(R.id.list_view);
        array = getResources().getStringArray(R.array.fish_array);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,new ArrayList<String>(Arrays.asList(array)));
        list.setAdapter(adapter);
        setSupportActionBar(binding.appBarMain.toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, findViewById(R.id.toolbar), 0, 0);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.id_fish) {
            array = getResources().getStringArray(R.array.fish_array);
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
        } else if (id == R.id.id_na) {
            array = getResources().getStringArray(R.array.naj_array);
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
        } else if (id == R.id.id_sna) {
            array = getResources().getStringArray(R.array.sna_array);
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
        } else if (id == R.id.id_pri) {
            array = getResources().getStringArray(R.array.pri_array);
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}