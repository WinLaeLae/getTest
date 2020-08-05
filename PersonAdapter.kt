package mm.com.fairway.fourthapprecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_person.view.*
import mm.com.fairway.fourthapprecyclerview.R
import mm.com.fairway.fourthapprecyclerview.model.Person

class PersonAdapter(var personList:ArrayList<Person>) : RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        TODO("Not yet implemented")
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item_person,parent,false)
        return PersonViewHolder(view)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
        return personList.size
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        TODO("Not yet implemented")
        holder.bindPerson(personList[position])
    }

    // ViewHolder
    class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var person: Person
        fun bindPerson(person: Person) {
            //to show data views at layout
            itemView.nametxt.text = person.name
            itemView.occupationtxt.text = person.occupation

        }
    }
}