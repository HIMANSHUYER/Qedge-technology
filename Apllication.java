public void paint(Graphics g) {  
        g.drawString("Hello",40,40);  
        setBackground(Color.WHITE);  
        g.fillRect(130, 30,100, 80);  
        g.drawOval(30,130,50, 60);  
        setForeground(Color.RED);  
        g.fillOval(130,130,50, 60);  
        g.drawArc(30, 200, 40,50,90,60);  

        g.fillArc(30, 130, 40,50,180,40);  

# code changes by ethan for feature 2.2 for hdfc application

 public static void main(String[] args) {  
        DisplayGraphics m=new DisplayGraphics();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        //f.setLayout(null);  
        f.setVisible(true);  
# End of feature 2.2 method
=======
        g.fillArc(30, 130, 40,50,180,40)



# code changes for feature2.1 by developer vivek on 2024 for services module for hdfc application


public class Main {
    public static void main(String[] argv) throws Exception {
        AudioInputStream stream = AudioSystem.getAudioInputStream(new File("audiofile"));

        // From URL
        // stream = AudioSystem.getAudioInputStream(new URL(
        // "http://hostname/audiofile"));

        AudioFormat format = stream.getFormat();
        if (format.getEncoding() != AudioFormat.Encoding.PCM_SIGNED) {
            format = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, format.getSampleRate(),
                    format.getSampleSizeInBits() * 2, format.getChannels(), format.getFrameSize() * 2,
                    format.getFrameRate(), true); // big endian
            stream = AudioSystem.getAudioInputStream(format, stream);
        }/*w  w   w   .  d  em    o2  s   .   c  o m */

        DataLine.Info info = new DataLine.Info(Clip.class, stream.getFormat(),
                ((int) stream.getFrameLength() * format.getFrameSize()));
        Clip clip = (Clip) AudioSystem.getLine(info);

        clip.open(stream);

        clip.start();


# End of feature2.1 method
