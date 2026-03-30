import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DiModule {
    // Define your dependencies here

    @Provides
    fun provideSomeDependency(): SomeDependency {
        return SomeDependency()
    }
}