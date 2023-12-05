import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigInteger;
import java.util.Random;

@RestController
@RequestMapping("/preprod")
public class PrimeController {

    @GetMapping("/new-prime")
    public String getNewPrime() {
        BigInteger prime = BigInteger.probablePrime(10_000, new Random());
      
        return prime.toString();
    }
}
