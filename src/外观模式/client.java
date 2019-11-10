package 外观模式;

public class client {
    service service;

    public client(外观模式.service service) {
        this.service = service;
    }

    public void visit()
    {
        service.dispatchwork();
    }
}
