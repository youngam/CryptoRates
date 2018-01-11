package best.lang.cryptorates.crypto

import best.lang.cryptorates.network.HttpClient
import javax.inject.Inject

class CryptoRepository @Inject constructor(private val httpClient: HttpClient) {

    suspend fun readCryptoRates()  = httpClient.readCryptoRates()
}