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

public class GencologActivity extends AppCompatActivity {
	
	
	private ArrayList<String> mid = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private TextView textview1;
	private ImageView imageview1;
	private ListView listview1;
	
	private Intent call = new Intent();
	private AlertDialog.Builder info;
	private AlertDialog.Builder information;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.gencolog);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
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
					information.setTitle(mid.get((int)(_position)));
					information.setMessage("امراض النساء ومتابعة الحمل\n\nحي باب الشارف قريب من مدرسة حنيشي محمد الشمالية");
					information.setNeutralButton("اتصل ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:0560198815"));
							startActivity(call);
						}
					});
					information.setPositiveButton("نسخ المعلومات ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mid.get((int)(_position)).concat("\nامراض النساء ومتابعة الحمل\n\nحي باب الشارف قريب من مدرسة حنيشي محمد الشمالية").concat("\ntel:0560198815".concat("\ntel:027900945"))));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					information.setNegativeButton("اتصل 2", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:027900945"));
							startActivity(call);
						}
					});
					information.create().show();
				}
				if (_position == 1) {
					info.setTitle(mid.get((int)(_position)));
					info.setMessage("\nأمراض النساء والتوليد\nشارع سيدي نايل (بجوار محلات كوندور");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:0553251914"));
							startActivity(call);
						}
					});
					info.setNegativeButton("نسخ المعلومات ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mid.get((int)(_position)).concat("\n\nأمراض النساء والتوليد\nشارع سيدي نايل (بجوار محلات كوندور\ntel:0553251914")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 2) {
					info.setTitle(mid.get((int)(_position)));
					info.setMessage("\nطب نساء وتوليد\nحي بربيح 474/11");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:0771475486"));
							startActivity(call);
						}
					});
					info.setNegativeButton("نسخ المعلومات ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mid.get((int)(_position)).concat("\nطب نساء وتوليد\nحي بربيح 474/11\ntel:0771475486")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 3) {
					info.setTitle(mid.get((int)(_position)));
					info.setMessage("أمراض النساء والتوليد\nحي السعادات بجوار القطاع العسكري");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:027900788"));
							startActivity(call);
						}
					});
					info.setNegativeButton("نسخ المعلومات ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mid.get((int)(_position)).concat("أمراض النساء والتوليد\nحي السعادات بجوار القطاع العسكري\ntel:027900788")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 4) {
					info.setTitle(mid.get((int)(_position)));
					info.setMessage("أمراض نساء\n852 رقم 05 عين الشيح\n");
					info.setNeutralButton("اتصل ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:0660613161"));
							startActivity(call);
						}
					});
					info.setNegativeButton("نسخ المعلومات ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mid.get((int)(_position)).concat("أمراض نساء\n852 رقم 05 عين الشيح\ntel:0660613161")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 5) {
					info.setTitle(mid.get((int)(_position)));
					info.setMessage("\nجراحة وأمراض نساء\nحي بربيح خلف إقامة الإناث");
					info.setNeutralButton("اتصل ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:0771242577"));
							startActivity(call);
						}
					});
					info.setNegativeButton("نسخ المعلومات ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mid.get((int)(_position)).concat("\nجراحة وأمراض نساء\nحي بربيح خلف إقامة الإناث\ntel:0771242577")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 6) {
					information.setTitle(mid.get((int)(_position)));
					information.setMessage("\nأمراض النساء والتوليد\nحي بلغزال بناية 867 رقم 15");
					information.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:0559096605"));
							startActivity(call);
						}
					});
					information.setPositiveButton("نسخ المعلومات ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mid.get((int)(_position)).concat("\nأمراض النساء والتوليد\nحي بلغزال بناية 867 رقم 15\ntel:0559096605")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.setNegativeButton("اتصل 2", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:027877821"));
							startActivity(call);
						}
					});
					information.create().show();
				}
				if (_position == 7) {
					info.setTitle(mid.get((int)(_position)));
					info.setMessage("\nأمراض النساء والتوليد\nحي المسجد الجديد بناية 295 رقم 6");
					info.setNeutralButton("اتصل ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:027873752"));
							startActivity(call);
						}
					});
					info.setNegativeButton("نسخ المعلومات ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mid.get((int)(_position)).concat("\nأمراض النساء والتوليد\nحي المسجد الجديد بناية 295 رقم 6\ntel:027873752")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 8) {
					info.setTitle(mid.get((int)(_position)));
					info.setMessage("أمراض النساء والتوليد\nحي بن جرمة (بجوار بطاش لبيع الهواتف");
					info.setNeutralButton("اتصل ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:0668123968"));
							startActivity(call);
						}
					});
					info.setNegativeButton("نسخ المعلومات ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mid.get((int)(_position)).concat("\nأمراض النساء والتوليد\nحي بن جرمة (بجوار بطاش لبيع الهواتف\ntel:0668123968")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
			}
		});
	}
	private void initializeLogic() {
		mid.add("بدوي خ");
		mid.add("تونسي ن");
		mid.add("خالدي عبد الحكيم ");
		mid.add("زمار خالد");
		mid.add("محمد عزوزي");
		mid.add("عمار يونسي");
		mid.add("بن جدو ب");
		mid.add("عبد الوهاب حارش");
		mid.add("غلاب س ر");
		listview1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, mid));
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
