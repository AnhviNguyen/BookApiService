package com.example.project5

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.project5.ui.screen.BooksViewModel
import com.example.project5.ui.screen.HomeScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BooksApp() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
//            CenterAlignedTopAppBar(
//                title = {
//                    Text(
//                        text = "BookShelf",
//                        style = MaterialTheme.typography.headlineMedium,
//                        color = Color.White
//                    )
//                },
//                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(Color(8, 133, 66))
//            )
        }
    ) {
        it ->
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val booksViewModel: BooksViewModel = viewModel(factory = BooksViewModel.Factory)
            val searchText by booksViewModel.searchText.collectAsState()
            val isSearching by booksViewModel.isSearching.collectAsState()

            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)
            ){
               TextField(
                   value = searchText,
                   onValueChange = booksViewModel::onSearchTextChange,
                   modifier = Modifier.fillMaxWidth(),
                   placeholder = { Text(text = "Search")}
               )
                Spacer(modifier = Modifier.height(10.dp))
                HomeScreen(
                    booksUiState = booksViewModel.booksUiState,
                    viewModel = booksViewModel,
                    retryAction = booksViewModel::getBook,
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = it
                )
            }

        }
    }
}


