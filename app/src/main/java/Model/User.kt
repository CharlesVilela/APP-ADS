package Model

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName ="user")
data class User (
    @PrimaryKey(autoGenerate = true) val id: Int,
    @NonNull @ColumnInfo(name= "email") val email: String,
    @NonNull @ColumnInfo(name = "password") val password: String
    ) {
}