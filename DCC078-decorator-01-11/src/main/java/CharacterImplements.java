public class CharacterImplements implements Character{
    public float damage;


    public CharacterImplements(){}

    public CharacterImplements(float damage){
        this.damage = damage;
    }

    @Override
    public float getCharacterDamage() {
        return damage;
    }
}
