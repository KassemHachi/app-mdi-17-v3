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
import android.support.design.widget.FloatingActionButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;

public class MainActivity extends AppCompatActivity {
	
	
	private FloatingActionButton _fab;
	
	private LinearLayout linear19;
	private ScrollView vscroll1;
	private TextView textview1;
	private ImageView imageview13;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear7;
	private LinearLayout linear11;
	private LinearLayout linear15;
	private LinearLayout linear26;
	private LinearLayout linear31;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private ImageView mdi;
	private ImageView diabete;
	private ImageView imageview5;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private ImageView mdiinterne;
	private ImageView nephrologie;
	private ImageView kids;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private ImageView pneumo;
	private ImageView cardiaque;
	private ImageView neurosurgery;
	private LinearLayout linear16;
	private LinearLayout linear23;
	private LinearLayout linear24;
	private ImageView jiraha;
	private ImageView orl;
	private ImageView ophthalmology;
	private LinearLayout linear27;
	private LinearLayout linear32;
	private LinearLayout linear29;
	private ImageView dentist;
	private ImageView orthopedic;
	private ImageView microscope;
	private LinearLayout linear28;
	private ImageView hospital;
	
	private Intent scr = new Intent();
	private AlertDialog.Builder aboutus;
	private Intent fb = new Intent();
	private Intent email = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		_fab = (FloatingActionButton) findViewById(R.id._fab);
		
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		textview1 = (TextView) findViewById(R.id.textview1);
		imageview13 = (ImageView) findViewById(R.id.imageview13);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		linear31 = (LinearLayout) findViewById(R.id.linear31);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		mdi = (ImageView) findViewById(R.id.mdi);
		diabete = (ImageView) findViewById(R.id.diabete);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		mdiinterne = (ImageView) findViewById(R.id.mdiinterne);
		nephrologie = (ImageView) findViewById(R.id.nephrologie);
		kids = (ImageView) findViewById(R.id.kids);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		pneumo = (ImageView) findViewById(R.id.pneumo);
		cardiaque = (ImageView) findViewById(R.id.cardiaque);
		neurosurgery = (ImageView) findViewById(R.id.neurosurgery);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		jiraha = (ImageView) findViewById(R.id.jiraha);
		orl = (ImageView) findViewById(R.id.orl);
		ophthalmology = (ImageView) findViewById(R.id.ophthalmology);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		linear32 = (LinearLayout) findViewById(R.id.linear32);
		linear29 = (LinearLayout) findViewById(R.id.linear29);
		dentist = (ImageView) findViewById(R.id.dentist);
		orthopedic = (ImageView) findViewById(R.id.orthopedic);
		microscope = (ImageView) findViewById(R.id.microscope);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		hospital = (ImageView) findViewById(R.id.hospital);
		aboutus = new AlertDialog.Builder(this);
		
		mdi.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				scr.setAction(Intent.ACTION_VIEW);
				scr.setClass(getApplicationContext(), MdiActivity.class);
				startActivity(scr);
			}
		});
		
		diabete.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				scr.setClass(getApplicationContext(), DiabetesActivity.class);
				startActivity(scr);
			}
		});
		
		imageview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				scr.setAction(Intent.ACTION_VIEW);
				scr.setClass(getApplicationContext(), GencologActivity.class);
				startActivity(scr);
			}
		});
		
		mdiinterne.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				scr.setClass(getApplicationContext(), MdinternActivity.class);
				startActivity(scr);
			}
		});
		
		nephrologie.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				scr.setAction(Intent.ACTION_VIEW);
				scr.setClass(getApplicationContext(), NephrologieActivity.class);
				startActivity(scr);
			}
		});
		
		kids.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				scr.setAction(Intent.ACTION_VIEW);
				scr.setClass(getApplicationContext(), KidsActivity.class);
				startActivity(scr);
			}
		});
		
		pneumo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				scr.setAction(Intent.ACTION_VIEW);
				scr.setClass(getApplicationContext(), PneumoActivity.class);
				startActivity(scr);
			}
		});
		
		cardiaque.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				scr.setAction(Intent.ACTION_VIEW);
				scr.setClass(getApplicationContext(), CardiaqueActivity.class);
				startActivity(scr);
			}
		});
		
		neurosurgery.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				scr.setAction(Intent.ACTION_VIEW);
				scr.setClass(getApplicationContext(), NeurosurgeryActivity.class);
				startActivity(scr);
			}
		});
		
		jiraha.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				scr.setAction(Intent.ACTION_VIEW);
				scr.setClass(getApplicationContext(), JirahaActivity.class);
				startActivity(scr);
			}
		});
		
		orl.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				scr.setAction(Intent.ACTION_VIEW);
				scr.setClass(getApplicationContext(), OrlActivity.class);
				startActivity(scr);
			}
		});
		
		ophthalmology.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				scr.setAction(Intent.ACTION_VIEW);
				scr.setClass(getApplicationContext(), OphthalmologyActivity.class);
				startActivity(scr);
			}
		});
		
		dentist.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				scr.setAction(Intent.ACTION_VIEW);
				scr.setClass(getApplicationContext(), DentistActivity.class);
				startActivity(scr);
			}
		});
		
		orthopedic.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				scr.setAction(Intent.ACTION_VIEW);
				scr.setClass(getApplicationContext(), OrthopedicActivity.class);
				startActivity(scr);
			}
		});
		
		microscope.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				scr.setAction(Intent.ACTION_VIEW);
				scr.setClass(getApplicationContext(), MicrActivity.class);
				startActivity(scr);
			}
		});
		
		hospital.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				scr.setAction(Intent.ACTION_VIEW);
				scr.setClass(getApplicationContext(), HospitalActivity.class);
				startActivity(scr);
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				aboutus.setTitle("حول تطبيق ");
				aboutus.setMessage("بمساعدة نادي المطورين الجلفة ( code club djelfa) تم إنشاء تطبيق اطباء الجلفة \n\n_ الوصف :\nتطبيق اطباء الجلفة هو تطبيق يسهل عملية البحث عن الاطباء داخل المدينة الجلفة بطريقة منتظمة حيث يساعد على معرفة التخصص اي طبيب و اماكنهم و ارقامهم\n\n_ الاصدار :1.1\n\n_ تاريخ الاصدار : 2019/1/1\n\n* اذ وجدتم خطأ او اردتم اضافة طبيب جديد او اقتراح ما عليكم سوى مراسلة عبر البريد الإلكتروني او الصفحة الرسمية على الفيس بوك وسنرد عليكم في اقرب وقت ممكن ");
				aboutus.setPositiveButton("صفحتنا على الفيس بوك ", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						fb.setAction(Intent.ACTION_VIEW);
						fb.setData(Uri.parse("https://facebook.com/AppsMedicinDz"));
						startActivity(fb);
					}
				});
				aboutus.setNeutralButton("راسلنا عبر البريد الإلكتروني ", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						email.setAction(Intent.ACTION_VIEW);
						email.setData(Uri.parse("mailto:appsmedicindz@gmail.com"));
						startActivity(email);
					}
				});
				aboutus.create().show();
			}
		});
	}
	private void initializeLogic() {
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
