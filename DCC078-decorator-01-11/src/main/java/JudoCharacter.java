public class JudoCharacter extends CharacterDecorator{

    public JudoCharacter(Character character){
        super(character);
    }

    @Override
    public float getDamage() {
        return 50.5f;
    }
}
