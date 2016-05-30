package interp.SVG;

import interp.Data;

import java.util.HashMap;

public class SVGMove extends SVGSerializableParallelizable {


    public enum Type {WAIT}; //etc
    public Type type;
    HashMap<String,Data> attr;

    // CONSTRUCTORS //

    public SVGMove(float dur) {
        super(dur);
        this.type = Type.WAIT;
        attr = new HashMap<>();
    }

    public SVGMove(interp.SVG.SVGMove.Type type, float dur) {
        super(dur);
        this.type = type;

    }

    public SVGMove(Type type, float init, float end) {
        super(init, end);
        this.type = type;
    }

    public SVGMove(Type type, HashMap<String, Data> attr, float dur) {
        super(dur);
        this.type = type;
        this.attr = attr;

    }
    public SVGMove(Type type, HashMap<String, Data> attr, float init, float end) {
        super(init, end);
        this.type = type;
        this.attr = attr;
    }

    public SVGMove(SVGMove svgMove) {
        super(svgMove);
        this.type = svgMove.type;
        this.attr = new HashMap<>(svgMove.attr);
    }

    // GETTERS I SETTERS // 

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public HashMap<String, Data> getAttr() {
        return attr;
    }

    public void setAttr(HashMap<String, Data> attr) {
        this.attr = attr;
    }

    @Override
    public String toString() {
        return "SVGMove{" +
                "type=" + type +
                ", attr=" + attr +
                ", init=" + init +
                ", end=" + end +
                '}';
    }

    // TODO
    public String getSVGCode(float wait) {
        return null;
    }

    @Override
    public SVGMove copy() {
        return new SVGMove(this);
    }
}
