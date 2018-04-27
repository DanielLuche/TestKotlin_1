package com.dluche.testkotlin_1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ListView
import com.dluche.testkotlin_1.adapter.MyAdapter

class MainActivity : AppCompatActivity() {

    private var texto : String
    private var inteiro : Int
    private val CONSTANTE : String = "KEY"
    private var aux : ArrayList<HashMap<String,String>>
    private var lv_lista : ListView?
    private var mAdapter : MyAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //
        initVars()
        iniAction()
    }

    init {
        texto = ""
        inteiro = -1
        lv_lista = null
        aux = ArrayList()
        mAdapter = MyAdapter(
                this,
                aux,
                R.layout.cell
        );
    }
    private fun initVars(){
        lv_lista = findViewById(R.id.lv_lista) as ListView
        //
        generateList()
    }

    private fun iniAction() {

        lv_lista?.adapter = mAdapter
        //
        /*lv_lista.setOnItemClickListener(AdapterView.OnItemClickListener {

            }
        );*/

    }

    private fun generateList(): ArrayList<HashMap<String,String>> {
        val initalList: List<String> = listOf(
                "Iron Man",
                "Cap America",
                "Hulk",
                "Thor",
                "Black Widow",
                "Spider Man",
                "Black Panter",
                "Vision",
                "Scarllet Witch",
                "Falcon")

        for(i in 0 until initalList.size){
            var hmAux: HashMap<String,String> = HashMap()
            //
            hmAux.put(MyConstants.KEY_1,i.toString())
            hmAux.put(MyConstants.VAL_1,initalList.get(i))
            //
            aux.add(hmAux)
        }

        /*var HashMap: HashMap<String,String> = HashMap()
        var HashMap2: HashMap<String,String>  = HashMap()
        var HashMap3: HashMap<String,String>  = HashMap()
        var HashMap4: HashMap<String,String>  = HashMap()
        var HashMap5: HashMap<String,String>  = HashMap()
        var HashMap6: HashMap<String,String>  = HashMap()
        //
        HashMap.put(MyConstants.KEY_1,"0")
        HashMap.put(MyConstants.VAL_1,"Iron Man")
        //
        HashMap2.put(MyConstants.KEY_1,"1")
        HashMap2.put(MyConstants.VAL_1,"Cap America")
        //
        HashMap3.put(MyConstants.KEY_1,"2")
        HashMap3.put(MyConstants.VAL_1,"Hulk")
        //
        HashMap4.put(MyConstants.KEY_1,"3")
        HashMap4.put(MyConstants.VAL_1,"Thor")
        //
        HashMap5.put(MyConstants.KEY_1,"4")
        HashMap5.put(MyConstants.VAL_1,"Black Widow")
        //
        HashMap6.put(MyConstants.KEY_1,"5")
        HashMap6.put(MyConstants.VAL_1,"Spider Man")
        HashMap6.put(MyConstants.KEY_1,"5")
        HashMap6.put(MyConstants.VAL_1,"Spider Man")
        //
        aux.add(HashMap)
        aux.add(HashMap2)
        aux.add(HashMap3)
        aux.add(HashMap4)
        aux.add(HashMap5)
        aux.add(HashMap6)
        //
        */
        return aux
    }
}
