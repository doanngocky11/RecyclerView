package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ItemAdapter adapter;
    private List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        itemList = new ArrayList<>();
        itemList.add(new Item("Cà phê Arabica", "Hương vị thanh, nhẹ, vị chua đặc trưng."));
        itemList.add(new Item("Cà phê Robusta", "Đậm đà, nhiều caffeine, vị mạnh mẽ."));
        itemList.add(new Item("Trà matcha", "Màu xanh mát, hương thơm tự nhiên."));
        itemList.add(new Item("Nước cam tươi", "Tăng sức đề kháng, vị chua ngọt tự nhiên."));
        itemList.add(new Item("Sinh tố bơ", "Béo ngậy, giàu dinh dưỡng."));
        itemList.add(new Item("Cà phê sữa đá", "Kết hợp giữa vị đắng cà phê và vị béo của sữa."));
        itemList.add(new Item("Trà đào cam sả", "Mùi thơm sả dịu, vị chua ngọt tươi mát."));
        itemList.add(new Item("Nước ép dưa hấu", "Giải nhiệt, cung cấp vitamin A và C."));
        itemList.add(new Item("Sinh tố xoài", "Vị ngọt dịu, hương thơm đặc trưng của xoài."));
        itemList.add(new Item("Sữa tươi trân châu đường đen", "Béo ngậy, ngọt dịu và thơm đường đen."));
        itemList.add(new Item("Trà sữa matcha", "Vị trà xanh thanh mát hòa quyện cùng sữa béo."));
        itemList.add(new Item("Trà chanh mật ong", "Giúp thanh lọc cơ thể và tăng đề kháng."));
        itemList.add(new Item("Sinh tố dâu", "Màu hồng bắt mắt, vị ngọt thanh dễ chịu."));

        adapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(adapter);
    }
}
