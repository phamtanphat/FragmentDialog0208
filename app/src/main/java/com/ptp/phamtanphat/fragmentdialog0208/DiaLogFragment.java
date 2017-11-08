package com.ptp.phamtanphat.fragmentdialog0208;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by KhoaPhamPC on 8/11/2017.
 */

public class DiaLogFragment extends DialogFragment  {
    AlertDialog.Builder dialog;
    SendData sendData;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        dialog = new AlertDialog.Builder(getActivity());
        dialog.setMessage("Bạn có chắc muốn thoát");
        sendData = (SendData) getActivity();
        dialog.setPositiveButton("Co", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                sendData.ChangeText("Co");
            }
        });
        dialog.setNegativeButton("Khong", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                sendData.ChangeText("Khong");
            }
        });
        Dialog thongbao = dialog.create();
        return thongbao;
    }
}
