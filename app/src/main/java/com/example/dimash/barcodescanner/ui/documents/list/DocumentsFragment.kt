package com.example.dimash.barcodescanner.ui.documents.list

import android.app.AlertDialog
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.dimash.barcodescanner.R
import kotlinx.android.synthetic.main.documents_create_dialog.view.*
import kotlinx.android.synthetic.main.documents_fragment.*

class DocumentsFragment : Fragment() {

    companion object {
        fun newInstance() = DocumentsFragment()
    }

    private lateinit var viewModel: DocumentsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.documents_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DocumentsViewModel::class.java)
        // TODO: Use the ViewModel

        button_add.setOnClickListener{
            val mDialogView = LayoutInflater.from(this.context).inflate(R.layout.documents_create_dialog, null)
            val mBuilder = AlertDialog.Builder(this.context)
                .setView(mDialogView)
                .setTitle("Create Form")

            val mAlertDialog = mBuilder.show()

            mDialogView.dialogCreateBtn.setOnClickListener{
                mAlertDialog.dismiss()
            }
            mDialogView.dialogCancelBtn.setOnClickListener{
                mAlertDialog.dismiss()
            }
        }

    }

}
