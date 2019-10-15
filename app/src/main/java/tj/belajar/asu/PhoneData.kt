package tj.belajar.asu

import java.io.Serializable

class PhoneData(
    val phone: Long,
    val contactName: String? ,
    var image : String?
): Serializable
