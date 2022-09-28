<?php

if (!function_exists('envo_storefront_generate_construct_footer')) :
    /**
     * Build footer
     */
    add_action('envo_storefront_generate_footer', 'envo_storefront_generate_construct_footer');

    function envo_storefront_generate_construct_footer() {
        ?>
        <div class="footer-credits-text text-center">
            <?php
            /* translators: %s: WordPress name with wordpress.org URL */
            printf(esc_html__('Proudly powered by %s', 'envo-storefront'), '<a href="' . esc_url(__('#', 'envo-storefront')) . '">' . esc_html__('ITI', 'envo-storefront') . '</a>');
            ?>
            <span class="sep"> | </span>
            <?php
            /* translators: %1$s: Envo Storefront theme name (do not translate) with envothemes.com URL */
            printf(esc_html__('Theme: %1$s', 'envo-storefront'), '<a href="' . esc_url('#') . '">' . esc_html_x('ITI BARDO', 'Theme name, do not translate', 'envo-storefront') . '</a>');
            ?>
        </div> 
        <?php
    }

endif;


add_filter('the_excerpt', 'custom_excerpt');

function custom_excerpt($text) {
    $newText = "filter hook applied".$text;
    return $newText;

}



add_action('wp_head', 'custom_author');

function custom_author() {
   echo '<meta name="author" content="ITI :)">';

}

add_action( 'init', 'create_post_type' );
function create_post_type() {
    register_post_type( 'testmonial',
    
        array(
          'labels' => array(
           'name' => __( 'Testmonials' ),
           'singular_name' => __( 'Testmonial' )
          ),
          'public' => true,
          'has_archive' => True,
         )
        );
    }
        


add_action( 'init', 'create_custom_tax' );
function create_custom_tax() {
    $args = array(
            'label' => __( 'Genre' ),
            'hierarchical' => true,
        );
    register_taxonomy( 'genre', 'testmonial', $args);
}