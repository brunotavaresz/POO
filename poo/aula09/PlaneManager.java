package aula09;

import java.util.ArrayList;

public class PlaneManager {
    private ArrayList<Plane> planes;

    public PlaneManager() {
        planes = new ArrayList<Plane>();
    }

    public void addPlane(Plane plane) {
        planes.add(plane);
    }

    public boolean removePlane(String id) {
        for (int i = 0; i < planes.size(); i++) {
            Plane plane = planes.get(i);
            if (plane.getId().equals(id)) {
                planes.remove(i);
                return true;
            }
        }
        return false;
    }

    public Plane searchPlane(String id) {
        for (int i = 0; i < planes.size(); i++) {
            Plane plane = planes.get(i);
            if (plane.getId().equals(id)) {
                return plane;
            }
        }
        return null;
    }

    public void printAllPlanes() {
        System.out.println("====== Informação de todos os aviões ======");
        for (int i = 0; i < planes.size(); i++) {
            System.out.println(planes.get(i).toString());
        }
    }

    public void printCommercialPlaneList() {
        System.out.println("====== Lista de aviões comerciais ======");
        for (int i = 0; i < planes.size(); i++) {
            Plane plane = planes.get(i);
            if (plane instanceof CommercialPlane) {
                System.out.println(plane.toString());
            }
        }
    }

    public void printMilitaryPlaneList() {
        System.out.println("====== Lista de aviões militares ======");
        for (int i = 0; i < planes.size(); i++) {
            Plane plane = planes.get(i);
            if (plane instanceof MilitaryPlane) {
                System.out.println(plane.toString());
            }
        }
    }

    public Plane getFastestPlane() {
        if (planes.isEmpty()) {
            return null;
        }
        Plane fastestPlane = planes.get(0);
        for (int i = 1; i < planes.size(); i++) {
            if (planes.get(i).getMaxSpeed() > fastestPlane.getMaxSpeed()) {
                fastestPlane = planes.get(i);
            }
        }
        return fastestPlane;
    }

    public void printFastestPlaneInfo() {
        if (planes.size() == 0) {
            System.out.println("Não há aviões cadastrados.");
            return;
        }

        Plane fastestPlane = planes.get(0);
        for (int i = 1; i < planes.size(); i++) {
            Plane plane = planes.get(i);
            if (plane.getMaxSpeed() > fastestPlane.getMaxSpeed()) {
                fastestPlane = plane;
            }
        }

        System.out.println("====== Informações do avião mais rápido ======");
        System.out.println(fastestPlane.toString());
    }
}