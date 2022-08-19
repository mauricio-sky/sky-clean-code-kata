package uk.sky.kata.cleancode.exercise;

public class Exercise3 {

    // Options to refactoring:
    // 1 - Using a Factory class
    // 2 - Using enum

    public Object generateReport(Object data, String reportType) {
        Object finalReport = null;

        if ("Client".equals(reportType)) {
            finalReport = clientReport(data);
        } else if ("HouseKeeping".equals(reportType)) {
            finalReport = houseKeepingReport(data);
        } else if ("Ledger".equals(reportType)) {
            finalReport = ledgerReport(data);
        } else if ("Audit".equals(reportType)) {
            finalReport = auditReport(data);
        }

        return finalReport;
    }

    Object clientReport(Object data) {
        return null;
    }

    Object houseKeepingReport(Object data) {
        return null;
    }

    Object ledgerReport(Object data) {
        return null;
    }

    Object auditReport(Object data) {
        return null;
    }
}
