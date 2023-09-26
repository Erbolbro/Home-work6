public class Skeleton extends Boss{
    private  Boss boss;
    private int arrowcount;
    private int bones ;
    private int  spine;

    public int getBones() {
        return bones;
    }

    public void setBones(int bones) {
        this.bones = bones;
    }

    public int getSpine() {
        return spine;
    }

    public void setSpine(int spine) {
        this.spine = spine;
    }

    public int getArrowcount() {
        return arrowcount;
    }
    @Override
    public String printinfo() {
        return "Количество стрел - " + getArrowcount() + "Spine - " + getSpine() + "Bones" + getBones();

    }
}
