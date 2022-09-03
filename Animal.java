
public abstract class Animal {
	
	public abstract void sonido();
	
	public abstract void desplazarse();
}

class Perro extends Animal{
	@Override
	public void desplazarse () {
		System.out.println("camino como perrito");
	}
	@Override
	public void sonido() {
		System.out.println("wau wau");
	}
}
class Gato extends Animal{
	@Override
	public void desplazarse () {
		System.out.println("camino como gatito");
	}
	@Override
	public void sonido() {
		System.out.println("miau miau");
	}
}
class Vaca extends Animal{
	@Override
	public void desplazarse () {
		System.out.println("camino como vaca");
	}
	@Override
	public void sonido() {
		System.out.println("muu muu");
	}
}
class Pajaro extends Animal{
	@Override
	public void desplazarse () {
		System.out.println("yo vuelo");
	}
	@Override
	public void sonido() {
		System.out.println("pio pio");
	}
}
class Leon extends Animal{
	@Override
	public void desplazarse () {
		System.out.println("avanzo como leon");
	}
	@Override
	public void sonido() {
		System.out.println("roar roar");
	}
	
}