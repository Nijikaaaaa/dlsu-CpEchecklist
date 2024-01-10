package com.example.cpechecklist;

import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private Rectangle baschem;

    @FXML
    private Rectangle basphys;

    @FXML
    private Rectangle caleng1;

    @FXML
    private Rectangle caleng2;

    @FXML
    private Rectangle caleng3;

    @FXML
    private Rectangle coedisc;

    @FXML
    private Rectangle datsral;

    @FXML
    private Rectangle discrmt;

    @FXML
    private Rectangle engchem;

    @FXML
    private Rectangle engphys;

    @FXML
    private Rectangle fndmath;

    @FXML
    private Rectangle fndstat;

    @FXML
    private Rectangle fundckt;

    @FXML
    private Rectangle gepcomm;

    @FXML
    private Rectangle lbbch1a;

    @FXML
    private Rectangle lboec2a;

    @FXML
    private Rectangle lbycpa1;

    @FXML
    private Rectangle lbycpa2;

    @FXML
    private Rectangle lbycpei;

    @FXML
    private Rectangle lbyec2b;

    @FXML
    private Rectangle lbyec2m;

    @FXML
    private Rectangle lbyph1a;

    @FXML
    private Rectangle prologi;

    @FXML
    private Rectangle nummets;

    @FXML
    private Rectangle engdata;

    @FXML
    private Rectangle lbycpd2;

    @FXML
    private Rectangle sofdesg;

    @FXML
    private Rectangle engenvi;

    @FXML
    private Rectangle fundlec;

    @FXML
    private Rectangle lbycpc2;

    @FXML
    private Rectangle fdcnsys;

    @FXML
    private Rectangle lbycpc3;

    @FXML
    private Rectangle mxsigfn;

    @FXML
    private Rectangle logdsgn;

    @FXML
    private Rectangle lbycpg4;

    @FXML
    private Rectangle micpros;

    @FXML
    private Rectangle lbycpa3;

    @FXML
    private Rectangle lbycpb3;

    @FXML
    private Rectangle lbyec3b;

    @FXML
    private Rectangle lbycpf2;

    @FXML
    private Rectangle lbycpg2;

    @FXML
    private Rectangle digdacm;

    @FXML
    private Rectangle csysarc;

    @FXML
    private Rectangle lbycpd3;

    @FXML
    private Rectangle embdsys;

    @FXML
    private Rectangle lbycpm3;

    @FXML
    private Rectangle lbycpg3;

    @FXML
    private Rectangle remeths;

    @FXML
    private Rectangle opessys;

    @FXML
    private Rectangle lbycpo1;

    // color
    @FXML
    void caleng1enter(MouseEvent event) {
        fndmath.setFill(javafx.scene.paint.Color.YELLOW);
    }
    @FXML
    void caleng1exit(MouseEvent event) {
        caleng1.setFill(javafx.scene.paint.Color.WHITE);
        fndmath.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void caleng2enter(MouseEvent event) {
        caleng1.setFill(javafx.scene.paint.Color.YELLOW);
        fndmath.setFill(javafx.scene.paint.Color.YELLOW);
    }
    @FXML
    void caleng2exit(MouseEvent event) {
        caleng2.setFill(javafx.scene.paint.Color.WHITE);
        caleng1.setFill(javafx.scene.paint.Color.WHITE);
        fndmath.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void caleng3enter(MouseEvent event) {
        caleng2.setFill(javafx.scene.paint.Color.YELLOW);
        caleng1.setFill(javafx.scene.paint.Color.YELLOW);
        fndmath.setFill(javafx.scene.paint.Color.YELLOW);
    }
    @FXML
    void caleng3exit(MouseEvent event) {
        caleng2.setFill(javafx.scene.paint.Color.WHITE);
        caleng1.setFill(javafx.scene.paint.Color.WHITE);
        fndmath.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void nummetsenter(MouseEvent event) {
        caleng3.setFill(javafx.scene.paint.Color.YELLOW);
        caleng2.setFill(javafx.scene.paint.Color.YELLOW);
        caleng1.setFill(javafx.scene.paint.Color.YELLOW);
        fndmath.setFill(javafx.scene.paint.Color.YELLOW);
    }
    @FXML
    void nummetsexit(MouseEvent event) {
        caleng3.setFill(javafx.scene.paint.Color.WHITE);
        caleng2.setFill(javafx.scene.paint.Color.WHITE);
        caleng1.setFill(javafx.scene.paint.Color.WHITE);
        fndmath.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void fdcnsysenter(MouseEvent event) {
        nummets.setFill(javafx.scene.paint.Color.YELLOW);
        caleng3.setFill(javafx.scene.paint.Color.YELLOW);
        caleng2.setFill(javafx.scene.paint.Color.YELLOW);
        caleng1.setFill(javafx.scene.paint.Color.YELLOW);
        fndmath.setFill(javafx.scene.paint.Color.YELLOW);
        lbycpc3.setFill(javafx.scene.paint.Color.CYAN);
    }
    @FXML
    void fdcnsysexit(MouseEvent event) {
        nummets.setFill(javafx.scene.paint.Color.WHITE);
        caleng3.setFill(javafx.scene.paint.Color.WHITE);
        caleng2.setFill(javafx.scene.paint.Color.WHITE);
        caleng1.setFill(javafx.scene.paint.Color.WHITE);
        fndmath.setFill(javafx.scene.paint.Color.WHITE);
        lbycpc3.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void lbycpc3enter(MouseEvent event) {
        fdcnsys.setFill(javafx.scene.paint.Color.CYAN);
    }
    @FXML
    void lbycpc3exit(MouseEvent event) {
        fdcnsys.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void lbycpa1enter(MouseEvent event) {
        prologi.setFill(javafx.scene.paint.Color.CYAN);
    }
    @FXML
    void lbycpa1exit(MouseEvent event) {
        prologi.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void prologienter(MouseEvent event) {
        lbycpa1.setFill(javafx.scene.paint.Color.CYAN);
    }
    @FXML
    void prologiexit(MouseEvent event) {
        lbycpa1.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void engphysenter(MouseEvent event) {
        caleng1.setFill(javafx.scene.paint.Color.GREENYELLOW);
        basphys.setFill(javafx.scene.paint.Color.YELLOW);
        lbyph1a.setFill(javafx.scene.paint.Color.CYAN);
    }
    @FXML
    void engphysexit(MouseEvent event) {
        caleng1.setFill(javafx.scene.paint.Color.WHITE);
        basphys.setFill(javafx.scene.paint.Color.WHITE);
        engphys.setFill(javafx.scene.paint.Color.WHITE);
        lbyph1a.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void engdataenter(MouseEvent event) {
        caleng2.setFill(javafx.scene.paint.Color.GREENYELLOW);
        fndstat.setFill(javafx.scene.paint.Color.YELLOW);
    }
    @FXML
    void engdataexit(MouseEvent event) {
        caleng2.setFill(javafx.scene.paint.Color.WHITE);
        fndstat.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void lbyec3benter(MouseEvent event) {
        lboec2a.setFill(javafx.scene.paint.Color.YELLOW);
        caleng2.setFill(javafx.scene.paint.Color.GREENYELLOW);
        fndstat.setFill(javafx.scene.paint.Color.YELLOW);
    }
    @FXML
    void lbyec3bexit(MouseEvent event) {
        lboec2a.setFill(javafx.scene.paint.Color.WHITE);
        caleng2.setFill(javafx.scene.paint.Color.WHITE);
        fndstat.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void lbyph1aenter(MouseEvent event) {
        engphys.setFill(javafx.scene.paint.Color.CYAN);
    }
    @FXML
    void lbyph1aexit(MouseEvent event) {
        engphys.setFill(javafx.scene.paint.Color.WHITE);
        lbyph1a.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void lbyec2benter(MouseEvent event) {
        lboec2a.setFill(javafx.scene.paint.Color.YELLOW);
    }
    @FXML
    void lbyec2bexit(MouseEvent event) {
        lboec2a.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void lbycpeienter(MouseEvent event) {
        prologi.setFill(javafx.scene.paint.Color.YELLOW);
    }
    @FXML
    void lbycpeiexit(MouseEvent event) {
        prologi.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void engchementer(MouseEvent event) {
        baschem.setFill(javafx.scene.paint.Color.YELLOW);
        lbbch1a.setFill(javafx.scene.paint.Color.CYAN);
    }
    @FXML
    void engchemexit(MouseEvent event) {
        baschem.setFill(javafx.scene.paint.Color.WHITE);
        lbbch1a.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void lbbch1aenter(MouseEvent event) {
        engchem.setFill(javafx.scene.paint.Color.CYAN);
    }
    @FXML
    void lbbch1aexit(MouseEvent event) {
        engchem.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void lbycpa2enter(MouseEvent event) {
        datsral.setFill(javafx.scene.paint.Color.CYAN);
    }
    @FXML
    void lbycpa2exit(MouseEvent event) {
        datsral.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void fundcktenter(MouseEvent event) {
        basphys.setFill(javafx.scene.paint.Color.YELLOW);
        engphys.setFill(javafx.scene.paint.Color.YELLOW);
        lbyec2m.setFill(javafx.scene.paint.Color.CYAN);
    }
    @FXML
    void fundcktexit(MouseEvent event) {
        basphys.setFill(javafx.scene.paint.Color.WHITE);
        engphys.setFill(javafx.scene.paint.Color.WHITE);
        lbyec2m.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void fundlecenter(MouseEvent event) {
        basphys.setFill(javafx.scene.paint.Color.YELLOW);
        engphys.setFill(javafx.scene.paint.Color.YELLOW);
        fundckt.setFill(javafx.scene.paint.Color.YELLOW);
        lbycpc2.setFill(javafx.scene.paint.Color.CYAN);
    }
    @FXML
    void fundlecexit(MouseEvent event) {
        basphys.setFill(javafx.scene.paint.Color.WHITE);
        engphys.setFill(javafx.scene.paint.Color.WHITE);
        lbycpc2.setFill(javafx.scene.paint.Color.WHITE);
        fundckt.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void mxsigfnenter(MouseEvent event) {
        basphys.setFill(javafx.scene.paint.Color.YELLOW);
        engphys.setFill(javafx.scene.paint.Color.YELLOW);
        fundckt.setFill(javafx.scene.paint.Color.YELLOW);
        fundlec.setFill(javafx.scene.paint.Color.YELLOW);
    }
    @FXML
    void mxsigfnexit(MouseEvent event) {
        basphys.setFill(javafx.scene.paint.Color.WHITE);
        engphys.setFill(javafx.scene.paint.Color.WHITE);
        fundlec.setFill(javafx.scene.paint.Color.WHITE);
        fundckt.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void lbycpf2enter(MouseEvent event) {
        basphys.setFill(javafx.scene.paint.Color.YELLOW);
        engphys.setFill(javafx.scene.paint.Color.YELLOW);
        fundckt.setFill(javafx.scene.paint.Color.YELLOW);
        fundlec.setFill(javafx.scene.paint.Color.YELLOW);
    }
    @FXML
    void lbycpf2exit(MouseEvent event) {
        basphys.setFill(javafx.scene.paint.Color.WHITE);
        engphys.setFill(javafx.scene.paint.Color.WHITE);
        fundlec.setFill(javafx.scene.paint.Color.WHITE);
        fundckt.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void digdacmenter(MouseEvent event) {
        basphys.setFill(javafx.scene.paint.Color.YELLOW);
        engphys.setFill(javafx.scene.paint.Color.YELLOW);
        fundckt.setFill(javafx.scene.paint.Color.YELLOW);
        fundlec.setFill(javafx.scene.paint.Color.YELLOW);
    }
    @FXML
    void digdacmexit(MouseEvent event) {
        basphys.setFill(javafx.scene.paint.Color.WHITE);
        engphys.setFill(javafx.scene.paint.Color.WHITE);
        fundlec.setFill(javafx.scene.paint.Color.WHITE);
        fundckt.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void logdsgnenter(MouseEvent event) {
        basphys.setFill(javafx.scene.paint.Color.YELLOW);
        engphys.setFill(javafx.scene.paint.Color.YELLOW);
        fundckt.setFill(javafx.scene.paint.Color.YELLOW);
        fundlec.setFill(javafx.scene.paint.Color.YELLOW);
        lbycpg4.setFill(javafx.scene.paint.Color.CYAN);
    }
    @FXML
    void logdsgnexit(MouseEvent event) {
        basphys.setFill(javafx.scene.paint.Color.WHITE);
        engphys.setFill(javafx.scene.paint.Color.WHITE);
        fundlec.setFill(javafx.scene.paint.Color.WHITE);
        fundckt.setFill(javafx.scene.paint.Color.WHITE);
        lbycpg4.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void micprosenter(MouseEvent event) {
        logdsgn.setFill(javafx.scene.paint.Color.YELLOW);
        basphys.setFill(javafx.scene.paint.Color.YELLOW);
        engphys.setFill(javafx.scene.paint.Color.YELLOW);
        fundckt.setFill(javafx.scene.paint.Color.YELLOW);
        fundlec.setFill(javafx.scene.paint.Color.YELLOW);
        lbycpa3.setFill(javafx.scene.paint.Color.CYAN);
    }
    @FXML
    void micprosexit(MouseEvent event) {
        logdsgn.setFill(javafx.scene.paint.Color.WHITE);
        basphys.setFill(javafx.scene.paint.Color.WHITE);
        engphys.setFill(javafx.scene.paint.Color.WHITE);
        fundlec.setFill(javafx.scene.paint.Color.WHITE);
        fundckt.setFill(javafx.scene.paint.Color.WHITE);
        lbycpa3.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void csysarcenter(MouseEvent event) {
        micpros.setFill(javafx.scene.paint.Color.YELLOW);
        logdsgn.setFill(javafx.scene.paint.Color.YELLOW);
        basphys.setFill(javafx.scene.paint.Color.YELLOW);
        engphys.setFill(javafx.scene.paint.Color.YELLOW);
        fundckt.setFill(javafx.scene.paint.Color.YELLOW);
        fundlec.setFill(javafx.scene.paint.Color.YELLOW);
        lbycpd3.setFill(javafx.scene.paint.Color.CYAN);
    }
    @FXML
    void csysarcexit(MouseEvent event) {
        micpros.setFill(javafx.scene.paint.Color.WHITE);
        logdsgn.setFill(javafx.scene.paint.Color.WHITE);
        basphys.setFill(javafx.scene.paint.Color.WHITE);
        engphys.setFill(javafx.scene.paint.Color.WHITE);
        fundlec.setFill(javafx.scene.paint.Color.WHITE);
        fundckt.setFill(javafx.scene.paint.Color.WHITE);
        lbycpd3.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void lbycpd3enter(MouseEvent event) {
        csysarc.setFill(javafx.scene.paint.Color.CYAN);
    }
    @FXML
    void lbycpd3exit(MouseEvent event) {
        csysarc.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void embdsysenter(MouseEvent event) {
        micpros.setFill(javafx.scene.paint.Color.YELLOW);
        logdsgn.setFill(javafx.scene.paint.Color.YELLOW);
        basphys.setFill(javafx.scene.paint.Color.YELLOW);
        engphys.setFill(javafx.scene.paint.Color.YELLOW);
        fundckt.setFill(javafx.scene.paint.Color.YELLOW);
        fundlec.setFill(javafx.scene.paint.Color.YELLOW);
        lbycpm3.setFill(javafx.scene.paint.Color.CYAN);
    }
    @FXML
    void embdsysexit(MouseEvent event) {
        micpros.setFill(javafx.scene.paint.Color.WHITE);
        logdsgn.setFill(javafx.scene.paint.Color.WHITE);
        basphys.setFill(javafx.scene.paint.Color.WHITE);
        engphys.setFill(javafx.scene.paint.Color.WHITE);
        fundlec.setFill(javafx.scene.paint.Color.WHITE);
        fundckt.setFill(javafx.scene.paint.Color.WHITE);
        lbycpm3.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void lbycpm3enter(MouseEvent event) {
        embdsys.setFill(javafx.scene.paint.Color.CYAN);
    }
    @FXML
    void lbycpm3exit(MouseEvent event) {
        embdsys.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void lbycpb3enter(MouseEvent event) {
        logdsgn.setFill(javafx.scene.paint.Color.YELLOW);
        basphys.setFill(javafx.scene.paint.Color.YELLOW);
        engphys.setFill(javafx.scene.paint.Color.YELLOW);
        fundckt.setFill(javafx.scene.paint.Color.YELLOW);
        fundlec.setFill(javafx.scene.paint.Color.YELLOW);
    }
    @FXML
    void lbycpb3exit(MouseEvent event) {
        logdsgn.setFill(javafx.scene.paint.Color.WHITE);
        basphys.setFill(javafx.scene.paint.Color.WHITE);
        engphys.setFill(javafx.scene.paint.Color.WHITE);
        fundlec.setFill(javafx.scene.paint.Color.WHITE);
        fundckt.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void remethsenter(MouseEvent event) {
        gepcomm.setFill(javafx.scene.paint.Color.YELLOW);
        caleng2.setFill(javafx.scene.paint.Color.GREENYELLOW);
        fndstat.setFill(javafx.scene.paint.Color.YELLOW);
        engdata.setFill(javafx.scene.paint.Color.YELLOW);
        logdsgn.setFill(javafx.scene.paint.Color.YELLOW);
        basphys.setFill(javafx.scene.paint.Color.YELLOW);
        engphys.setFill(javafx.scene.paint.Color.YELLOW);
        fundckt.setFill(javafx.scene.paint.Color.YELLOW);
        fundlec.setFill(javafx.scene.paint.Color.YELLOW);
    }
    @FXML
    void remethsexit(MouseEvent event) {
        gepcomm.setFill(javafx.scene.paint.Color.WHITE);
        caleng2.setFill(javafx.scene.paint.Color.WHITE);
        fndstat.setFill(javafx.scene.paint.Color.WHITE);
        engdata.setFill(javafx.scene.paint.Color.WHITE);
        logdsgn.setFill(javafx.scene.paint.Color.WHITE);
        basphys.setFill(javafx.scene.paint.Color.WHITE);
        engphys.setFill(javafx.scene.paint.Color.WHITE);
        fundlec.setFill(javafx.scene.paint.Color.WHITE);
        fundckt.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void lbycpg4enter(MouseEvent event) {
        logdsgn.setFill(javafx.scene.paint.Color.CYAN);
    }
    @FXML
    void lbycpg4exit(MouseEvent event) {
        logdsgn.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void lbycpa3enter(MouseEvent event) {
        micpros.setFill(javafx.scene.paint.Color.CYAN);
    }
    @FXML
    void lbycpa3exit(MouseEvent event) {
        micpros.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void lbyec2menter(MouseEvent event) {
        fundckt.setFill(javafx.scene.paint.Color.CYAN);
    }
    @FXML
    void lbyec2mexit(MouseEvent event) {
        fundckt.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void lbycpc2enter(MouseEvent event) {
        fundlec.setFill(javafx.scene.paint.Color.CYAN);
    }
    @FXML
    void lbycpc2exit(MouseEvent event) {
        fundlec.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void lbycpd2enter(MouseEvent event) {
        sofdesg.setFill(javafx.scene.paint.Color.CYAN);
    }
    @FXML
    void lbycpd2exit(MouseEvent event) {
        sofdesg.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void datsralenter(MouseEvent event) {
        prologi.setFill(javafx.scene.paint.Color.YELLOW);
        lbycpei.setFill(javafx.scene.paint.Color.YELLOW);
        lbycpa2.setFill(javafx.scene.paint.Color.CYAN);
    }
    @FXML
    void datsralexit(MouseEvent event) {
        prologi.setFill(javafx.scene.paint.Color.WHITE);
        lbycpei.setFill(javafx.scene.paint.Color.WHITE);
        lbycpa2.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void discrmtenter(MouseEvent event) {
        fndmath.setFill(javafx.scene.paint.Color.YELLOW);
        caleng1.setFill(javafx.scene.paint.Color.YELLOW);
    }
    @FXML
    void discrmtexit(MouseEvent event) {
        fndmath.setFill(javafx.scene.paint.Color.WHITE);
        caleng1.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void sofdesgenter(MouseEvent event) {
        prologi.setFill(javafx.scene.paint.Color.YELLOW);
        lbycpei.setFill(javafx.scene.paint.Color.YELLOW);
        lbycpd2.setFill(javafx.scene.paint.Color.CYAN);
        datsral.setFill(Color.YELLOW);
    }
    @FXML
    void sofdesgexit(MouseEvent event) {
        datsral.setFill(Color.WHITE);
        prologi.setFill(javafx.scene.paint.Color.WHITE);
        lbycpei.setFill(javafx.scene.paint.Color.WHITE);
        lbycpd2.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void opessysenter(MouseEvent event) {
        prologi.setFill(javafx.scene.paint.Color.YELLOW);
        lbycpei.setFill(javafx.scene.paint.Color.YELLOW);
        lbycpo1.setFill(javafx.scene.paint.Color.CYAN);
        datsral.setFill(Color.YELLOW);
    }
    @FXML
    void opessysexit(MouseEvent event) {
        datsral.setFill(Color.WHITE);
        prologi.setFill(javafx.scene.paint.Color.WHITE);
        lbycpei.setFill(javafx.scene.paint.Color.WHITE);
        lbycpo1.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void lbycpo1enter(MouseEvent event) {
        opessys.setFill(javafx.scene.paint.Color.CYAN);
    }
    @FXML
    void lbycpo1exit(MouseEvent event) {
        opessys.setFill(javafx.scene.paint.Color.WHITE);
    }
    @FXML
    void engenvienter(MouseEvent event) {
        baschem.setFill(javafx.scene.paint.Color.YELLOW);
        engchem.setFill(javafx.scene.paint.Color.YELLOW);
    }
    @FXML
    void engenviexit(MouseEvent event) {
        baschem.setFill(javafx.scene.paint.Color.WHITE);
        engchem.setFill(javafx.scene.paint.Color.WHITE);
    }
}