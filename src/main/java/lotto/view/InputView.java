package lotto.view;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static lotto.config.LottoErrorMessages.INVALID_NUMBER_INPUT;
import static lotto.view.OutputView.printMessage;

public class InputView {

    private InputView() {
        throw new IllegalStateException("InputView is utility class");
    }

    public static int inputPurchaseAmount() {
        while (true) {
            try {
                return Integer.parseInt(readUserInput());
            } catch (NumberFormatException e) {
                printMessage(INVALID_NUMBER_INPUT.getMessage());
            }
        }
    }

    public static String inputWinningNumbers() {
        return readUserInput();
    }

    public static int inputBonusNumber() {
        while (true) {
            try {
                return Integer.parseInt(readUserInput());
            } catch (NumberFormatException e) {
                printMessage(INVALID_NUMBER_INPUT.getMessage());
            }
        }
    }

    private static String readUserInput() {
        return readLine();
    }
}