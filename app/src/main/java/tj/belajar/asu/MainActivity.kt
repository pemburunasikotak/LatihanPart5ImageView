package tj.belajar.asu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import tj.belajar.git.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = createPhoneDate()
        rv_part.layoutManager = LinearLayoutManager(this)
        rv_part.setHasFixedSize(true)
        rv_part.adapter = ContactAdapter(testData, {phoneItem : PhoneData->phoneItemClicked(phoneItem)})
    }



    private fun phoneItemClicked (phoneItem : PhoneData){
        val  showDetailActivityIntent = Intent(this, PhoneDetailActivity::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, phoneItem.phone.toString())
        startActivity(showDetailActivityIntent)
    }

    private fun createPhoneDate() : List<PhoneData>{
        val partList = ArrayList<PhoneData>()
        partList.add(PhoneData(85786534862,"TA"))
        partList.add(PhoneData(85786534861,"TB"))
        partList.add(PhoneData(85786534863,"TC"))
        partList.add(PhoneData(85786534864,"TD"))
        partList.add(PhoneData(85786534865,"TE"))
        partList.add(PhoneData(85786534866,"TF"))
        partList.add(PhoneData(85786534867,"TG"))
        partList.add(PhoneData(85786534870,"TH"))
        partList.add(PhoneData(85786534871,"TI"))
        partList.add(PhoneData(85786534872,"TJ"))
        partList.add(PhoneData(85786534873,"TK"))
        partList.add(PhoneData(85786534874,"TL"))
        partList.add(PhoneData(85786534875,"TM"))
        partList.add(PhoneData(85786534876,"TN"))
        partList.add(PhoneData(85786534877,"TO"))
        partList.add(PhoneData(85786534878,"TP"))
        partList.add(PhoneData(85786534879,"TQ"))
        partList.add(PhoneData(85786534880,"TR"))
        return partList
    }
}
