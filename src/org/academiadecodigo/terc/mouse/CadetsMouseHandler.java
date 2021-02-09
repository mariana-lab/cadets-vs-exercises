package org.academiadecodigo.terc.mouse;

import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

public class CadetsMouseHandler implements MouseHandler {

    private Mouse mouse;

    public CadetsMouseHandler() {

        this.mouse = new Mouse(this);
        mouse.addEventListener(MouseEventType.MOUSE_CLICKED);
        mouse.addEventListener(MouseEventType.MOUSE_MOVED);

    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        //chose cadet
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        //drag toplace on the grid

    }
}
