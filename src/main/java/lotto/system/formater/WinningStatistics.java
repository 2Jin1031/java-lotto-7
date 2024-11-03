package lotto.system.formater;

import java.util.Map;
import lotto.system.utils.PrizeType;

public class WinningStatistics {

    private static final String STATISTICS_HEADER = "당첨 통계\n---";

    public static String formatStatistics(Map<PrizeType, Integer> statistics) {
        StringBuilder sb = new StringBuilder();
        sb.append(STATISTICS_HEADER).append("\n");

        for (PrizeType prizeType : PrizeType.values()) {
            int count = statistics.getOrDefault(prizeType, 0);
            String formattedWinning = WinningFormatter.formatWinnings(prizeType.getCode(), count);
            sb.append(formattedWinning).append("\n");
        }

        sb.append(ProfitRateFormatter.formatAsMessage(ProfitRateCalculator.calculate(statistics)));
        return sb.toString();
    }
}
