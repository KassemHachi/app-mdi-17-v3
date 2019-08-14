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

public class CardiaqueActivity extends AppCompatActivity {
	
	
	private ArrayList<String> mdi = new ArrayList<>();
	
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
		setContentView(R.layout.cardiaque);
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
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage("حي بربيح مقابل مديرية السكن");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:0553430093"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("حي بربيح مقابل مديرية السكن\ntel:0553430093")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 1) {
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage("حي شعباني مقابل مستشفى الامومة والطفولة ");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:027874135"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("حي شعباني مقابل مستشفى الامومة والطفولة\ntel:027874135")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 2) {
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage("حي بلغزال بالقرب من مسجد بلغزال");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:0556355110"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("حي بلغزال بالقرب من مسجد بلغزال\ntel:0556355110")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 3) {
					info.setTitle(mdi.get((int)(_position)));
					info.setMessage("حي المستشفى مقابل المجلس الولائي ");
					info.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:0550489426"));
							startActivity(call);
						}
					});
					info.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("حي المستشفى مقابل المجلس الولائي\ntel:0550489426")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					info.create().show();
				}
				if (_position == 4) {
					information.setTitle(mdi.get((int)(_position)));
					information.setMessage("ساحة محمد بوضياف عمارة 1");
					information.setNeutralButton("اتصل", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:027873131"));
							startActivity(call);
						}
					});
					information.setNegativeButton("اتصل 2", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							call.setAction(Intent.ACTION_DIAL);
							call.setData(Uri.parse("tel:0771163189"));
							startActivity(call);
						}
					});
					information.setPositiveButton("نسخ المعلومات", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", mdi.get((int)(_position)).concat("ساحة محمد بوضياف عمارة 01\ntel:027873131\ntel:0771163189")));
							SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ! ");
						}
					});
					information.create().show();
				}
			}
		});
	}
	private void initializeLogic() {
		mdi.add("حاشي ج");
		mdi.add("عيسوا ابراهيم ");
		mdi.add("لحرش رشيد علي");
		mdi.add("طالبي محمد");
		mdi.add("سيجري ك");
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
