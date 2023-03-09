package ru.edu.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.edu.myapplication.adapter.DatabaseAdapter
import ru.edu.myapplication.databinding.FragmentSecondBinding
import ru.edu.myapplication.dto.Database

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private lateinit var databaseAdapter: DatabaseAdapter
    private lateinit var recyclerView: RecyclerView

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.database_list)
        recyclerView.layoutManager = layoutManager
        databaseAdapter = DatabaseAdapter()
        databaseAdapter.setList(myDatabase())
        recyclerView.adapter = databaseAdapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initDatabase() {
        recyclerView = binding.databaseList
        databaseAdapter = DatabaseAdapter()
        recyclerView.adapter = databaseAdapter
        databaseAdapter.setList(myDatabase())
    }

    private fun myDatabase() = mutableListOf<Database>().apply {
        add(Database("DB1", "Postgre"))
        add(Database("DB2", "MySQL"))
        add(Database("DB3", "MSSQL"))
    }
}