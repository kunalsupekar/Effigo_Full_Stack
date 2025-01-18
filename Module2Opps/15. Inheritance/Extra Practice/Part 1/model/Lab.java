package model;

import java.util.ArrayList;

public class Lab {
        private ArrayList<LabEquipment> labEquipments; 


        public Lab(){
            this.labEquipments=new ArrayList<>();
        }


        public ArrayList<LabEquipment> getLabEquipments() {
            return labEquipments;
        }


        public void setLabEquipments(ArrayList<LabEquipment> labEquipments) {
            this.labEquipments = labEquipments;
        }
         

        public LabEquipment getLabEquipments(int index){
            return (this.labEquipments.get(index)).clone() ;
                
           
        }

        public void setLabEquipment(LabEquipment   labEquipment,int index){
            this.labEquipments.set(index, labEquipment.clone());
        }

        public void addLabEquipment(LabEquipment labEquipment){
            this.labEquipments.add(labEquipment.clone());
        }
      
}
