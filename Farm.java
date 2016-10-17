class Farm 
{     
   private Animal[] aBunchOfAnimals = new Animal[3];
   public Farm()
   {
   	aBunchOfAnimals[0] = new NamedCow("cow","moo","wilis");
   	aBunchOfAnimals[1] = new Chick("chick","cluck","cheep");
   	aBunchOfAnimals[2] = new Pig("pig","oink");
   }
      	public void animalSounds() 
   	{
   		for (int nI=0; nI<3;nI++)
   		{
   			System.out.println(aBunchOfAnimals[nI].getType()+" goes "+aBunchOfAnimals[nI].getSound());
   		}
         System.out.println("The cow is " + ((NamedCow)aBunchOfAnimals[0]).getName());
   	}
}
