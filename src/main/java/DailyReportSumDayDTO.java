import java.math.BigDecimal;

public class DailyReportSumDayDTO {
    private static final long serialVersionUID = 3117545431846603555L;

    private String channel;
    private String customerGroup;
    private BigDecimal presented;
    private BigDecimal pending;
    private BigDecimal accepted;
    private BigDecimal rejected;
    private BigDecimal error;
    private String productType;

    public DailyReportSumDayDTO() {
        super();
    }

    public DailyReportSumDayDTO(String channel, String customerGroup,
                                BigDecimal presented, BigDecimal pending, BigDecimal accepted,
                                BigDecimal rejected, BigDecimal error, String productType) {
        super();
        this.channel = channel;
        this.customerGroup = customerGroup;
        this.presented = presented;
        this.pending = pending;
        this.accepted = accepted;
        this.rejected = rejected;
        this.error = error;
        this.productType = productType;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getCustomerGroup() {
        return customerGroup;
    }

    public void setCustomerGroup(String customerGroup) {
        this.customerGroup = customerGroup;
    }

    public BigDecimal getPresented() {
        return presented;
    }

    public void setPresented(BigDecimal presented) {
        this.presented = presented;
    }

    public BigDecimal getPending() {
        return pending;
    }

    public void setPending(BigDecimal pending) {
        this.pending = pending;
    }

    public BigDecimal getAccepted() {
        return accepted;
    }

    public void setAccepted(BigDecimal accepted) {
        this.accepted = accepted;
    }

    public BigDecimal getRejected() {
        return rejected;
    }

    public void setRejected(BigDecimal rejected) {
        this.rejected = rejected;
    }

    public BigDecimal getError() {
        return error;
    }

    public void setError(BigDecimal error) {
        this.error = error;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
}
