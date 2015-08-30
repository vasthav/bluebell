    package co.silkroot.kc.bluebell;

import android.app.ActionBar;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by kc on 2/18/2015.
 */
public class MainScreen extends Fragment {
    private static final String TAG = "Main Screen";

    // Intent request codes
    private static final int REQUEST_CONNECT_DEVICE_SECURE = 1;
//    private static final int REQUEST_CONNECT_DEVICE_INSECURE = 2;
    private static final int REQUEST_ENABLE_BT = 2;

    // Layout Views
    private ListView mConversationView;
    private EditText mOutEditText;
    private Button mSendButton;


    // Name of the connected device
    private String mConnectedDeviceName = null;

    //* Array adapter for the conversation thread
    private ArrayAdapter<String> mConversationArrayAdapter;


    //  String buffer for outgoing messages
    private StringBuffer mOutStringBuffer;

    //  Local Bluetooth adapter
    private BluetoothAdapter mBluetoothAdapter = null;


}
