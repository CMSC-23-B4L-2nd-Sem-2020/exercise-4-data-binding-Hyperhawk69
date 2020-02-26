package com.example.android.aboutme.databinding;
import com.example.android.aboutme.R;
import com.example.android.aboutme.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.hello, 11);
        sViewsWithIds.put(R.id.thank_you, 12);
        sViewsWithIds.put(R.id.name_label, 13);
        sViewsWithIds.put(R.id.name_edit, 14);
        sViewsWithIds.put(R.id.nickname_label, 15);
        sViewsWithIds.put(R.id.nickname_edit, 16);
        sViewsWithIds.put(R.id.age_label, 17);
        sViewsWithIds.put(R.id.age_edit, 18);
        sViewsWithIds.put(R.id.birthday_label, 19);
        sViewsWithIds.put(R.id.birthday_edit, 20);
        sViewsWithIds.put(R.id.phone_label, 21);
        sViewsWithIds.put(R.id.phone_edit, 22);
        sViewsWithIds.put(R.id.color_label, 23);
        sViewsWithIds.put(R.id.color_edit, 24);
        sViewsWithIds.put(R.id.course_label, 25);
        sViewsWithIds.put(R.id.course_edit, 26);
        sViewsWithIds.put(R.id.dream_label, 27);
        sViewsWithIds.put(R.id.dream_edit, 28);
        sViewsWithIds.put(R.id.crush_label, 29);
        sViewsWithIds.put(R.id.crush_edit, 30);
        sViewsWithIds.put(R.id.message_label, 31);
        sViewsWithIds.put(R.id.message_edit, 32);
        sViewsWithIds.put(R.id.done_button, 33);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener ageTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of myInfo.age
            //         is myInfo.setAge((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(ageText);
            // localize variables for thread safety
            // myInfo.age
            java.lang.String myInfoAge = null;
            // myInfo != null
            boolean myInfoJavaLangObjectNull = false;
            // myInfo
            com.example.android.aboutme.MyInfo myInfo = mMyInfo;



            myInfoJavaLangObjectNull = (myInfo) != (null);
            if (myInfoJavaLangObjectNull) {




                myInfo.setAge(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener birthdayTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of myInfo.birthday
            //         is myInfo.setBirthday((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(birthdayText);
            // localize variables for thread safety
            // myInfo != null
            boolean myInfoJavaLangObjectNull = false;
            // myInfo
            com.example.android.aboutme.MyInfo myInfo = mMyInfo;
            // myInfo.birthday
            java.lang.String myInfoBirthday = null;



            myInfoJavaLangObjectNull = (myInfo) != (null);
            if (myInfoJavaLangObjectNull) {




                myInfo.setBirthday(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener colorTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of myInfo.color
            //         is myInfo.setColor((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(colorText);
            // localize variables for thread safety
            // myInfo != null
            boolean myInfoJavaLangObjectNull = false;
            // myInfo
            com.example.android.aboutme.MyInfo myInfo = mMyInfo;
            // myInfo.color
            java.lang.String myInfoColor = null;



            myInfoJavaLangObjectNull = (myInfo) != (null);
            if (myInfoJavaLangObjectNull) {




                myInfo.setColor(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener courseTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of myInfo.course
            //         is myInfo.setCourse((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(courseText);
            // localize variables for thread safety
            // myInfo != null
            boolean myInfoJavaLangObjectNull = false;
            // myInfo.course
            java.lang.String myInfoCourse = null;
            // myInfo
            com.example.android.aboutme.MyInfo myInfo = mMyInfo;



            myInfoJavaLangObjectNull = (myInfo) != (null);
            if (myInfoJavaLangObjectNull) {




                myInfo.setCourse(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener crushTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of myInfo.crush
            //         is myInfo.setCrush((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(crushText);
            // localize variables for thread safety
            // myInfo != null
            boolean myInfoJavaLangObjectNull = false;
            // myInfo.crush
            java.lang.String myInfoCrush = null;
            // myInfo
            com.example.android.aboutme.MyInfo myInfo = mMyInfo;



            myInfoJavaLangObjectNull = (myInfo) != (null);
            if (myInfoJavaLangObjectNull) {




                myInfo.setCrush(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener dreamTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of myInfo.dream
            //         is myInfo.setDream((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(dreamText);
            // localize variables for thread safety
            // myInfo != null
            boolean myInfoJavaLangObjectNull = false;
            // myInfo.dream
            java.lang.String myInfoDream = null;
            // myInfo
            com.example.android.aboutme.MyInfo myInfo = mMyInfo;



            myInfoJavaLangObjectNull = (myInfo) != (null);
            if (myInfoJavaLangObjectNull) {




                myInfo.setDream(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener messageTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of myInfo.message
            //         is myInfo.setMessage((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(messageText);
            // localize variables for thread safety
            // myInfo != null
            boolean myInfoJavaLangObjectNull = false;
            // myInfo.message
            java.lang.String myInfoMessage = null;
            // myInfo
            com.example.android.aboutme.MyInfo myInfo = mMyInfo;



            myInfoJavaLangObjectNull = (myInfo) != (null);
            if (myInfoJavaLangObjectNull) {




                myInfo.setMessage(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener nameTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of myInfo.name
            //         is myInfo.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(nameText);
            // localize variables for thread safety
            // myInfo != null
            boolean myInfoJavaLangObjectNull = false;
            // myInfo.name
            java.lang.String myInfoName = null;
            // myInfo
            com.example.android.aboutme.MyInfo myInfo = mMyInfo;



            myInfoJavaLangObjectNull = (myInfo) != (null);
            if (myInfoJavaLangObjectNull) {




                myInfo.setName(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener nicknameTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of myInfo.nickname
            //         is myInfo.setNickname((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(nicknameText);
            // localize variables for thread safety
            // myInfo != null
            boolean myInfoJavaLangObjectNull = false;
            // myInfo
            com.example.android.aboutme.MyInfo myInfo = mMyInfo;
            // myInfo.nickname
            java.lang.String myInfoNickname = null;



            myInfoJavaLangObjectNull = (myInfo) != (null);
            if (myInfoJavaLangObjectNull) {




                myInfo.setNickname(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener phoneTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of myInfo.phone
            //         is myInfo.setPhone((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(phoneText);
            // localize variables for thread safety
            // myInfo != null
            boolean myInfoJavaLangObjectNull = false;
            // myInfo
            com.example.android.aboutme.MyInfo myInfo = mMyInfo;
            // myInfo.phone
            java.lang.String myInfoPhone = null;



            myInfoJavaLangObjectNull = (myInfo) != (null);
            if (myInfoJavaLangObjectNull) {




                myInfo.setPhone(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 34, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[18]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ScrollView) bindings[0]
            , (android.widget.EditText) bindings[20]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[4]
            , (android.widget.EditText) bindings[24]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[6]
            , (android.widget.EditText) bindings[26]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[7]
            , (android.widget.EditText) bindings[30]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[9]
            , (android.widget.Button) bindings[33]
            , (android.widget.EditText) bindings[28]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[11]
            , (android.widget.EditText) bindings[32]
            , (android.widget.TextView) bindings[31]
            , (android.widget.TextView) bindings[10]
            , (android.widget.EditText) bindings[14]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[1]
            , (android.widget.EditText) bindings[16]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[2]
            , (android.widget.EditText) bindings[22]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[12]
            );
        this.ageText.setTag(null);
        this.bioScroll.setTag(null);
        this.birthdayText.setTag(null);
        this.colorText.setTag(null);
        this.courseText.setTag(null);
        this.crushText.setTag(null);
        this.dreamText.setTag(null);
        this.messageText.setTag(null);
        this.nameText.setTag(null);
        this.nicknameText.setTag(null);
        this.phoneText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.myInfo == variableId) {
            setMyInfo((com.example.android.aboutme.MyInfo) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMyInfo(@Nullable com.example.android.aboutme.MyInfo MyInfo) {
        this.mMyInfo = MyInfo;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.myInfo);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String myInfoCourse = null;
        com.example.android.aboutme.MyInfo myInfo = mMyInfo;
        java.lang.String myInfoCrush = null;
        java.lang.String myInfoDream = null;
        java.lang.String myInfoColor = null;
        java.lang.String myInfoAge = null;
        java.lang.String myInfoMessage = null;
        java.lang.String myInfoName = null;
        java.lang.String myInfoNickname = null;
        java.lang.String myInfoPhone = null;
        java.lang.String myInfoBirthday = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (myInfo != null) {
                    // read myInfo.course
                    myInfoCourse = myInfo.getCourse();
                    // read myInfo.crush
                    myInfoCrush = myInfo.getCrush();
                    // read myInfo.dream
                    myInfoDream = myInfo.getDream();
                    // read myInfo.color
                    myInfoColor = myInfo.getColor();
                    // read myInfo.age
                    myInfoAge = myInfo.getAge();
                    // read myInfo.message
                    myInfoMessage = myInfo.getMessage();
                    // read myInfo.name
                    myInfoName = myInfo.getName();
                    // read myInfo.nickname
                    myInfoNickname = myInfo.getNickname();
                    // read myInfo.phone
                    myInfoPhone = myInfo.getPhone();
                    // read myInfo.birthday
                    myInfoBirthday = myInfo.getBirthday();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.ageText, myInfoAge);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.birthdayText, myInfoBirthday);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.colorText, myInfoColor);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.courseText, myInfoCourse);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.crushText, myInfoCrush);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dreamText, myInfoDream);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.messageText, myInfoMessage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nameText, myInfoName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nicknameText, myInfoNickname);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.phoneText, myInfoPhone);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.ageText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, ageTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.birthdayText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, birthdayTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.colorText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, colorTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.courseText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, courseTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.crushText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, crushTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.dreamText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, dreamTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.messageText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, messageTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.nameText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, nameTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.nicknameText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, nicknameTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.phoneText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, phoneTextandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): myInfo
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}