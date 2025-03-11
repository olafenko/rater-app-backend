package site.justproject.raterappbackend.rater;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import site.justproject.raterappbackend.rater.dtos.AnswerRequest;
import site.justproject.raterappbackend.rater.dtos.BattleResponse;

@RestController
class RaterController {


    private final RaterService raterService;

    public RaterController(RaterService raterService) {
        this.raterService = raterService;
    }

    @GetMapping("/hello")
    public String welcome(){
        return "Welcome!";
    }


    @GetMapping("/battle")
    public BattleResponse getBattle(){

        return raterService.generateBattle();

    }

    @PostMapping("/answer")
    public void answer(@RequestBody AnswerRequest answerRequest){

        raterService.processWinner(answerRequest.battleId(),answerRequest.winnerId());

    }


}
