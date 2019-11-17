package 职责链模式;

public class jingli extends  manager{


    @Override
    void handlerequest(request request) {
        if(request.level<5)

        {
            dosomgthing();
        }
        else
        {
            siperior.handlerequest(request);
        }
    }

    private void dosomgthing() {

    }
}
