package com.dzappmdi.appmdi17;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.AdapterView;
import android.content.ClipData;
import android.content.ClipboardManager;

public class MdiActivity extends AppCompatActivity {
	
	
	private ArrayList<String> mdi = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear3;
	private TextView textview1;
	private ImageView imageview1;
	private ListView listview1;
	
	private Intent call = new Intent();
	private AlertDialog.Builder info;
	private AlertDialog.Builder information;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.mdi);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		textview1 = (TextView) findViewById(R.id.textview1);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		listview1 = (ListView) findViewById(R.id.listview1);
		info = new AlertDialog.Builder(this);
		information = new AlertDialog.Builder(this);
		
		listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (_position == 0) {
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage("حي الضاية 04/531");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:027874499"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("حي الضاية 04/531\ntel:027878275")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 1) {
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage("حي سليمان عميرات مقابل مسجد سيدي نايل ");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:027873443"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("حي سليمان عميرات مقابل مسجد سيدي نايل\ntel:027873443")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 2) {
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage(" شارع سيدي نايل رقم 73 بالقرب من حمام الحرفة");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:027873709"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat(" شارع سيدي نايل رقم 73 بالقرب من حمام الحرفة\ntel:027873709")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 3) {
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage("حي 100 دار خلف مركز التكوين المهني ");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:027903628"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("حي 100 دار خلف مركز التكوين المهني\ntel:027903628")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 4) {
					information.setTitle(mdi.get((int)(_position)));
					information.setMessage("حي بن عزيز بناية 74");
					information.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:027877026"));
							startActivity(call);
						}
					});
					information.setNegativeButton("اتصل 2", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:0551360857"));
							startActivity(call);
						}
					});
					information.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("حي بن عزيز بناية 74\ntel:027877026\ntel:0551360857")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					information.create().show();
				}
				if (_position == 5) {
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage("حي السعادة بناية 29/320");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:027873119"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("حي السعادة بناية 29/320\ntel:027873119")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 6) {
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage("حي بربيح 940 مقابل مدرسة بلاحي محمد");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:027878246"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("حي بربيح 940 مقابل مدرسة بلاحي محمد\ntel:027878246")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 7) {
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage("حي بوتريفيس طريق بوسعادة 02/357");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:027875990"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("حي بوتريفيس طريق بوسعادة 02/357\ntel:027875990")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 8) {
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage("وسط المدينة مقابل السوق ");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:027874499"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("وسط المدينة مقابل السوق\ntel:027874499")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 9) {
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage("حي بوتريفيس ");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:027873293"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("حي بوتريفيس\ntel:027873293")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 10) {
					information.setTitle(mdi.get((int)(_position)));
					information.setMessage("حي عين الشيح 57/841");
					information.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:027874327"));
							startActivity(call);
						}
					});
					information.setNegativeButton("اتصل 2", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:0555349151"));
							startActivity(call);
						}
					});
					information.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("حي عين الشيح 57/841\ntel:027874327\ntel:0555349151")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					information.create().show();
				}
				if (_position == 11) {
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage("حي بن جرمة 375/15");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:027871418"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("حي بن جرمة 375/15\ntel:027871418")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 12) {
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage("حي بن عزيز بناية 71 رقم 01");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:027903436"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("حي بن عزيز بناية 71 رقم 01\ntel:027903436")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 13) {
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage("حي 5 جويلية عمارة 4");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:0550885594"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("حي 5 جويلية عمارة 4\ntel:0550885594")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 14) {
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage("حي الفصحى بناية 40 رقم 73");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:0773501371"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("حي الفصحى بناية 40 رقم 73\ntel:0773501371")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 15) {
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage("حي عين الشيح مقابل تكوين المهني إناث ");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:0561624911"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("حي عين الشيح مقابل تكوين المهني إناث\ntel:0561624911")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 16) {
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage("حي بن الابيض عمارة 86 رقم 33");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:027897303"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("حي بن الابيض عمارة 86 رقم 33\ntel:027897303")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 17) {
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage("وسط المدينة عمارة 3 رقم 40 بجانب مسجد خالد بن وليد ");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:027933113"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("وسط المدينة عمارة 3 رقم 40 بجانب مسجد خالد بن وليد\ntel:027933113")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 18) {
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage("حي البناء الذاتي (100 دار) ");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:027901688"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("حي البناء الذاتي (100 دار)\nTel:027901688")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 19) {
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage("حي البناء الذاتي ");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:0664213694"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("حي البناء الذاتي\ntel:0664213694")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 20) {
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage("حي بوتريفيس 166 / 98");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:027902626"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("حي بوتريفيس 166 / 98\ntel:027902626")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 21) {
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage("حي المسجد الجديد بناية 336 رقم 24");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:027873678"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("حي المسجد الجديد بناية 336 رقم 24\ntel:027873678")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 22) {
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage("حي العمراوي - بوتريفيس ");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:0663266300"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("حي العمراوي - بوتريفيس\ntel:0663266300")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 23) {
					information.setTitle(mdi.get((int)(_position)));
					information.setMessage("شارع فلسطين بناية 174 رقم 23");
					information.setNegativeButton("اتصل 2", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:027870674"));
							startActivity(call);
						}
					});
					information.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:0776122399"));
							startActivity(call);
						}
					});
					information.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					information.create().show();
				}
				if (_position == 24) {
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage("حي 5 جويلية عمارة 14");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:0663508242"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("حي 5 جويلية عمارة 14\ntel:0663508242")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 25) {
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage("بالقرب من مفترق طرق الرويني ");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:027875033"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
			}
		});
	}
	private void initializeLogic() {
		mdi.add("مصطفاوي عيشة");
		mdi.add("ع حبيب");
		mdi.add("جاب الله مصطفى ");
		mdi.add("قيت عبد الباقي ");
		mdi.add("بورحلة محمد الياس ");
		mdi.add("لحرش حسيبة");
		mdi.add("غزال ز");
		mdi.add("عزي بوعلام ");
		mdi.add("حاج عيسى يوسف ");
		mdi.add("قدوري عبد الحليم ");
		mdi.add("دبوز محمد ");
		mdi.add("العمري الحسن");
		mdi.add("سعيد عبد الرحمن ");
		mdi.add("عروري مصطفى ");
		mdi.add("بن سيد فيروز");
		mdi.add("شكالي س");
		mdi.add("جلالية حسام الدين ");
		mdi.add("بن سالم نصيرة ");
		mdi.add("بن تونسي سعدي");
		mdi.add("برمان عبد الرحمن ");
		mdi.add("محفوظي ن");
		mdi.add("محمدي حكيم ");
		mdi.add("مسلمي عبد العزيز ");
		mdi.add("قويدر ونوقي");
		mdi.add("لخذاري فيصل ");
		mdi.add("امحمد محمد ");
		listview1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, mdi));
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
