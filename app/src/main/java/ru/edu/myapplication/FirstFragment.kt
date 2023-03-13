package ru.edu.myapplication

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_first.*
import ru.edu.myapplication.database.DatabaseService
import ru.edu.myapplication.databinding.FragmentFirstBinding
import java.io.File
import java.io.FileInputStream

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonAuth.setOnClickListener {
            val databaseService = DatabaseService(requireContext().applicationContext)
            val letDirectory = File(context?.filesDir, "LET")
            letDirectory.mkdirs()
            val file = File(letDirectory, "Records.txt")
            databaseService.createConnection()
            file.appendText("username: ${editTextTextEmailAddress.text}")
            databaseService.insertToLoginTable(editTextTextEmailAddress.text.toString(), "Firefox", "1241245151")
            val inputAsString = FileInputStream(file).bufferedReader().use { it.readText() }
            val builder = AlertDialog.Builder(context)
            builder.apply {
                setTitle("Warning")
                setMessage(inputAsString)
                setPositiveButton("OK") { dialog, i ->

                }
                builder.show()
            }
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        val letDirectory = File(context?.filesDir, "LET")
        letDirectory.mkdirs()
        val file = File(letDirectory, "Records.txt")
        file.delete()
    }

}