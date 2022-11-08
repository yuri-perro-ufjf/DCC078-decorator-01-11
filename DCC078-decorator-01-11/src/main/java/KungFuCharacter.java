public class KungFuCharacter extends CharacterDecorator {

    public KungFuCharacter(Character character){
        super(character);
    }

    @Override
    public float getDamage() {
        return 100.0f;
    }
}
