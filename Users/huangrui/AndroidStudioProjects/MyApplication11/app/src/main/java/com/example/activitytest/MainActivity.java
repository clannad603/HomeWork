package com.example.activitytest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//private  EditText editText;
//private  ImageView imageView;
//private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
//        editText=(EditText) findViewById(R.id.edit_text);
//        imageView =(ImageView) findViewById(R.id.image_view);
//        progressBar=(ProgressBar) findViewById(R.id.progress_bar);
//    Button button1=(Button) findViewById(R.id.button_1);
//      button1.setOnClickListener(new View.OnClickListener() {
//         @Override
//           public void onClick(View v) {
//           Intent intent =new Intent(Intent.ACTION_VIEW);
//            intent.setData(Uri.parse("http://www.bilibili.com"));//换成bilibili?
//              startActivity(intent);
//          }
//     });
//        Button button3=(Button) findViewById(R.id.button_3);
//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent =new Intent(Intent.ACTION_DIAL);
//                intent.setData(Uri.parse("tel:10086"));//换成bilibili?
//                startActivity(intent);
//            }
//        });
//      Button button4=(Button) findViewById(R.id.button_4);
//       button4.setOnClickListener(new View.OnClickListener() {
//           @Override
//          public void onClick(View v) {
//               String inputText=editText.getText().toString();
//               Toast.makeText(MainActivity.this,inputText,Toast.LENGTH_SHORT).show();
//           }
//      });
//        Button button5=(Button) findViewById(R.id.button_5);
//        button5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent =new Intent(MainActivity.this,MainActivity2.class);
//
//                startActivityForResult(intent ,1);
//            }
//        });
//        Button button6=(Button) findViewById(R.id.button_6);
//        button6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//               imageView.setImageResource(R.drawable.img_2);
//
//                }
//        });//change picture
//        Button button7=(Button) findViewById(R.id.button_7);
//        button7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(progressBar.getVisibility()==View.GONE){
//                    progressBar.setVisibility(View.VISIBLE);
//                }else {
//                    progressBar.setVisibility(View.GONE);
//                }
//
//            }
//        });//change pict
//        Button button8=(Button) findViewById(R.id.button_8);
//        button8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//               int progress=progressBar.getProgress();
//               progress=progress+10;
//progressBar.setProgress(progress);
//            }
//        });//change picture
//        Button button9=(Button) findViewById(R.id.button_9);
//        button9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);
//                dialog.setTitle("this is a dialog");
//                dialog.setMessage("something important");
//                dialog.setCancelable(false);
//                dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                });
//                dialog.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                });
//                dialog.show();
//
//            }
//        });//use it to give some worning;
        Button button10=(Button) findViewById(R.id.button_10);
        button10.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               

               }
       });



    }

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()){
//            case R.id.add_item:
//                Toast.makeText(this,"you clicked add",Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.remove_item:
//                Toast.makeText(this,"you clicked remove",Toast.LENGTH_SHORT).show();
//                break;
//            default:}
//            return  true;
//        }
//
//
//
//
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode,  Intent data) {
//
//        super.onActivityResult(requestCode, resultCode, data);
//
//}



}