package ru.shift.android_intensive_sample.ui.navigation

import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun BottomBar(
    selected: BottomTab,
    onSelected: (BottomTab) -> Unit
) {
    NavigationBar {
        BottomTab.entries.forEach { tab ->
            NavigationBarItem(
                selected = tab == selected,
                onClick = { onSelected(tab) },
                icon = {}, // Добавить иконки
                label = { Text(tab.title) }
            )
        }
    }
}