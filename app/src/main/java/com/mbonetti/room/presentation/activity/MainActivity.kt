package com.mbonetti.room.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.mbonetti.room.presentation.view_model.ContactViewModel
import com.mbonetti.room.presentation.screen.ContactScreen
import com.mbonetti.room.ui.theme.RoomTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var viewModel: ContactViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RoomTheme {
                viewModel = hiltViewModel<ContactViewModel>()
                val state by viewModel.state.collectAsState()
                ContactScreen(state = state, onEvent = viewModel::onEvent)
            }
        }
    }
}
