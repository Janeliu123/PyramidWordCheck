package fetchrewords.example.checkpyramidword.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.Arrays;

@RestController
public class PyramidController {
    @GetMapping("/checkPyramid")
    public ResponseEntity<String> checkPyramid(@RequestParam(value = "str") String str){
        str = str.toLowerCase();
        int[] letter = new int[26];
        for(int i=0; i<str.length();i++) {
            if(!Character.isLetter(str.charAt(i))) return ResponseEntity.ok(str + ": is NOT Pyramid!!!");
            letter[str.charAt(i) - 'a'] ++;
        }
        Arrays.sort(letter);
        int n = letter[25];
        for(int i=24;i>=0;i--){
            if(letter[i]!=--n) {
                return ResponseEntity.ok(str + ": is NOT Pyramid!!!");
            }
            if(n == 0)
                break;
        }
        return ResponseEntity.ok(str + ": is Pyramid!!!");
    }
}
