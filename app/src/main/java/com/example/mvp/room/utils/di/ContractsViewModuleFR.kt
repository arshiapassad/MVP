package academy.nouri.s3_mvp.room.utils.di

import androidx.fragment.app.Fragment
import com.example.mvp.room.ui.add.NoteContracts
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(FragmentComponent::class)
class ContractsViewModuleFR {

    @Provides
    fun noteView(fragment: Fragment): NoteContracts.View {
        return fragment as NoteContracts.View
    }
}