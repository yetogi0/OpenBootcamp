public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("este es el metodo save");
    }

    @Override
    public void findAll() {
        System.out.println("este es el metodo buscar");

    }

    @Override
    public void delete() {
        System.out.println("este es el metodo borrar");

    }
}
